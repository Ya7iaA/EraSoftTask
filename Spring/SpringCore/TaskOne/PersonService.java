package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class PersonService implements UserService {

    @Override
    public void saveName(String name) {
        System.out.println("For person the name saved as :" + name);
    }

    @Override
    public void updateName(String name) {
        System.out.println("For person the name updated to :" + name);
    }
}