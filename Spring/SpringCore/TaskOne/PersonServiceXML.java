package com.spring.core;

public class PersonServiceXML implements UserServiceXML {

    @Override
    public void saveName(String name) {
        System.out.println("For person the name saved as :" + name);
    }

    @Override
    public void updateName(String name) {
        System.out.println("For person the name updated to :" + name);
    }
}