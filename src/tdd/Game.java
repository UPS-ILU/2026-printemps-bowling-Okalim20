package tdd;

import java.lang.reflect.Constructor;

public class Game {
	private int nbTours=10;
	private int score=0;
	
	
	public Game() {
		
	}
	
	public void roll(int quilles) {
		score+=quilles;
	}
	
	
	public int score() {
		return score;
	}
}
