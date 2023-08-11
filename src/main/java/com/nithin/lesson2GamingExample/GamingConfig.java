package com.nithin.lesson2GamingExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nithin.annotatedDTO.GameConsole;
import com.nithin.annotatedDTO.GameRunner;
import com.nithin.annotatedDTO.pacMan;

@Configuration
public class GamingConfig {
    @Bean
    public GameConsole game(){
        return new pacMan();
    }

    /*
     * The above bean is equivalent of
     * var game = new PacMan();
     */

    @Bean
    public GameRunner gameRunner(GameConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
        
    }

    /*
     * The above bean is equivalent of
     * var game = new PacMan(); // instead of creating this we are passing it as parameter
     * var gameRunner = new GameRunner(game);
     */
}
