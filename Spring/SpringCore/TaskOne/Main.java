package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerService managerService = applicationContext.getBean("managerService", ManagerService.class);
        managerService.saveName("Ahmed");
        managerService.updateName("Ali");
        UserService personService = applicationContext.getBean("personService", PersonService.class);
        personService.saveName("Ahmed");
        personService.updateName("Ali");
    }
}