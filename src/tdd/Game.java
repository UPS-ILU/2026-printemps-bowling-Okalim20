package tdd;

import java.lang.reflect.Constructor;

public class Game {
	private int numTour=0;
	private int numLancer=0;
	private int score=0;
	private int spareTour=0;
	private int [] quilleTab = new int[20];
	
	public Game() {
		
	}
	
	public void roll(int quilles) {
		quilleTab[numLancer]=quilles;
		if(spareTour==1) {
			quilles=quilles*2;
			spareTour-=1;
		}
		
		if (numLancer%2==0) {
			numTour++;
		}
		else {
			if(quilleTab[numLancer]+quilleTab[numLancer-1]==10) {
				spareTour=1;
			}
		}
		numLancer++;
		score+=quilles;
		
}
	
	
	public int score() {
		return score;
	}
}
