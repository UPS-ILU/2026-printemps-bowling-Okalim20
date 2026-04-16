package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.Game;

class GameTest {

	@Test
	void testEntreeVide() {
		Game game = new Game();
		game.score();
	}

}
