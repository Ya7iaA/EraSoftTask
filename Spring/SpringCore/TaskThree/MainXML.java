package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService = applicationContext.getBean("person", PersonService.class);
        personService.saveName("Ayman");
    }
}