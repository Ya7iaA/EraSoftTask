package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.ManagerService;

public class MainXML {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerService managerService = applicationContext.getBean("manager", ManagerServiceXML.class);
        managerService.saveName("Ahmed");
        managerService.updateName("Ali");
        UserServiceXML personService = applicationContext.getBean("person", PersonServiceXML.class);
        personService.saveName("Ahmed");
        personService.updateName("Ali");
    }
}