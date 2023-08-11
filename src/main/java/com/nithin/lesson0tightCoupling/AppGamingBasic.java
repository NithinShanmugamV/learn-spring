package com.nithin.lesson0tightCoupling;

import com.nithin.dto.GameRunner;
import com.nithin.dto.pacMan;
import com.nithin.dto.pacManNew;

public class AppGamingBasic {
    public static void main(String[] args) {
		var game1 = new pacMan(); 
        var gameRunner = new GameRunner(game1);
        gameRunner.run();
		game1.up();
		game1.down();

		var game2 = new pacManNew(); // Object creation
        gameRunner = new GameRunner(game2); // Object creation + wiring of dependency
        gameRunner.run();
		game1.up();
		game1.down();
	}

}
/*
 * We will solve the tight coupling by using interface
 * 
 * game1, game2 is dependency of gamerunner which means
 * gamerunner cannot run without a game.
 * 
 * so game is created and injected to gamerunner and this
 * is called wiring of dependency
 */