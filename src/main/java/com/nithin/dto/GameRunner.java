package com.nithin.dto;


public class GameRunner {

    GameConsole game;
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println(game + " is running" );
    }

}
