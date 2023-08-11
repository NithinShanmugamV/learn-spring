package com.nithin.lesson1ConfigAndIoC;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nithin.dto.Address;

public class AppHelloSpring {
    public static void main(String[] args) {
        // 1: Launch a spring context
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class)) {
            // 2: Config the things that spring want to manage -
            // HelloWorldConfig - @Configuration
            // name - @bean
            System.out.println("name bean" + context.getBean("name"));
            System.out.println("age bean" + context.getBean("age"));
            System.out.println("person bean" + context.getBean("person"));
            System.out.println("address2 bean" + context.getBean("address2"));
            System.out.println("addesss bean" + context.getBean(Address.class));
            System.out.println(
                    "bean called inside another bean using method call" + context.getBean("person2MethodCall"));
            System.out
                    .println("bean called inside another bean using parameters" + context.getBean("person3MethodCall"));
            System.out.println(context.getBeanDefinitionCount());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }

}
/*
 * Spring contexts (Spring IoC containers) which are
 * responsible for instantiating, configuring, and
 * assembling beans by reading configuration metadata from
 * XML, Java annotations, and/or Java code in the
 * configuration files.
 * 
 * in getBean either you can use name of the bean or type
 * of the bean to retrieve it back.
 * 
 * IoC containers manages spring beans and their lifecycle
 */