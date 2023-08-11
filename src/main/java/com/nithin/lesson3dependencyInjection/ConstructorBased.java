package com.nithin.lesson3dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
class YourBusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }


    public String toString() {
        return "USING " + dependency1 + " AND " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}
@Configuration
@ComponentScan
public class ConstructorBased {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(ConstructorBased.class)) {
            System.out.println("\n\nEXAMPLE OF CONSTRUCTOR BASED INJECTION\n\n");
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
