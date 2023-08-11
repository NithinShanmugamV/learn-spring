package com.nithin.annotatedDTO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    GameConsole game;
    public GameRunner(@Qualifier("pacMan") GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println(game + " is running" );
    }

}
