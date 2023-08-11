package com.nithin.lesson3dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClassField {
    @Autowired
    Dependency1Field dependency1;
    @Autowired
    Dependency2Field dependency2;

}

@Component
class Dependency1Field {

}

@Component
class Dependency2Field {

}
@Configuration
@ComponentScan
public class FieldBased {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(FieldBased.class)){
            System.out.println("\n\nEXAMPLE OF FIELD BASED INJECTION\n\n");
            System.out.println(context.getBean(YourBusinessClassField.class));
        }
    }
}
