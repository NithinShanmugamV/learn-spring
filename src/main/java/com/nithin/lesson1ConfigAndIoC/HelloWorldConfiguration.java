package com.nithin.lesson1ConfigAndIoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nithin.dto.Address;
import com.nithin.dto.Person;


@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Nithin";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person(){
        return new Person("Nithin S", 20);
    }

    @Bean(name = "address2") 
    public Address address(){
        return new Address("Bleaker Street", "London");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());// here we are calling bean1 and bean2 
    }

    @Bean
    public Person person3MethodCall(String name, int age){
        return new Person(name, age); 
    }
    
}
/*
 * This is a spring configuration class. We will define what
 * spring will manage in this class
 * 
 * Here we define Spring beans( things that are managed by
 * spring beans)
 * 
 * getBean() uses method name to identify bean. To rename 
 * we can declare a name in bean definition @Bean(name = "address2") 
 * 
 * we can create a bean with relationship with existing bean
 * there are 2 ways to do it
 * 
 * first is method call. Inside the bean you call another bean
 * second is we can add parameters
 */