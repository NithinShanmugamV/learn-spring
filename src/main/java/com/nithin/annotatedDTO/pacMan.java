package com.nithin.annotatedDTO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacMan")
public class pacMan implements GameConsole{
    public void up(){
        System.out.println("Go up");
    }

    public void down(){
        System.out.println("Go down");
    }

    public void left(){
        System.out.println("Go left");
    }

    public void right(){
        System.out.println("Go right");
    }
}
