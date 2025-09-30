package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.ManagerService;

public class MainXML {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerService managerService = applicationContext.getBean("manager", ManagerService.class);
        managerService.saveName("Ahmed");
        managerService.updateName("Ali");
        UserService personService = applicationContext.getBean("person", PersonService.class);
        personService.saveName("Ahmed");
        personService.updateName("Ali");
    }
}