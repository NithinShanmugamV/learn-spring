package com.nithin.lesson3dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class YourBusinessClassSetter {
    Dependency1Setter dependency1;
    Dependency2Setter dependency2;

    @Autowired
    public void setDependency1(Dependency1Setter dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2Setter dependency2) {
        this.dependency2 = dependency2;
    }
    
}

@Component
class Dependency1Setter {

}

@Component
class Dependency2Setter {

}
@Configuration
@ComponentScan
public class SetterBased {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SetterBased.class)){
            System.out.println("\n\n EXAMPLE OF SETTER BASED INJECTION\n\n");
            System.out.println(context.getBean(YourBusinessClassSetter.class));
        }
    }
}
