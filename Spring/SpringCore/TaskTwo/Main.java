package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreConfig.class);
        AccountService accountService = applicationContext.getBean("getAccountService",AccountServiceImpl.class);
        accountService.getSavePerson("Ahmed");
    }
}