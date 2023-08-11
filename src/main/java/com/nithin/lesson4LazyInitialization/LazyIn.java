package com.nithin.lesson4LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
class ClassA {

}

@Component
class ClassB {

    public ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("\n\nClass B created and dependency A Injected\n\n");
        this.classA = classA;
    }


}

@Component
@Lazy
class ClassC {

    public ClassA classA;

    public ClassC(ClassA classA) {
        System.out.println("\n\nClass C created and dependency A Injected\n\n");
        this.classA = classA;
    }


}

@Configuration
@ComponentScan
public class LazyIn {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyIn.class)){
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassC.class));
        }
    }
}
