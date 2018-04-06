package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = (Person) context.getBean("person");
        System.out.println(person.getAddress().getNo());
    }
}
