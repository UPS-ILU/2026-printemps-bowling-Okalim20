package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.Game;

class GameTest {

	private Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void testEntreeVide() {
		assertEquals(0,game.score());
	}
	
	@Test
	void testVingtRoll() {
		for(int i=0;i<20;i++) {
			game.roll(0);
		}
		
		assertEquals(0, game.score());
	}
	
	@Test
	void test1quille() {
		for(int i=0;i<20;i++) {
			game.roll(1);
		}
		
		assertEquals(20, game.score());
	}
	
}
