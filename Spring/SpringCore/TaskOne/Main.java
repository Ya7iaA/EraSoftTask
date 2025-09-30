package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreConfig.class);
        ManagerService managerService = applicationContext.getBean("managerService", ManagerService.class);
        managerService.saveName("Ahmed");
        managerService.updateName("Ali");
        UserService personService = applicationContext.getBean("personService", PersonService.class);
        personService.saveName("Ahmed");
        personService.updateName("Ali");
    }
}