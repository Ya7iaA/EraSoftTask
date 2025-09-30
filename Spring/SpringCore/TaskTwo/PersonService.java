package com.spring.core;

public class PersonService implements UserService {

    @Override
    public void saveName(String name) {
        System.out.println("For person the name saved as :" + name);
    }
}