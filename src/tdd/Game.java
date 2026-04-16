package tdd;

import java.lang.reflect.Constructor;

public class Game {
	private int numTour=0;
	private int numLancer=0;
	private int score=0;
	private int spareTour=0;
	private int strikeTour=0;
	private int [] quilleTab = new int[20];
	
	public Game() {
		
	}
	
	public void roll(int quilles) {
		int scoreTour = quilles;
		quilleTab[numLancer]=quilles;
		if(spareTour==1) {
			scoreTour=quilles*2;
			spareTour-=1;
		}
		if(strikeTour>0) {
			scoreTour*=2;
		}
		if (numLancer%2==0) {
			numTour++;
			if(quilles==10) {
				strikeTour=2;
			}
		}
		else {
			if(quilleTab[numLancer]+quilleTab[numLancer-1]==10) {
				spareTour=1;
			}
		}
		numLancer++;
		score+=scoreTour;
		
}
	
	
	public int score() {
		return score;
	}
}
