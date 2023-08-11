package com.nithin.lesson2GamingExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nithin.annotatedDTO.GameConsole;

public class AppGamingSpringBean {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
            context.getBean(GameConsole.class).up();
            context.getBean(GameConsole.class).down();
        }

    }
}
