package com.spring.core;

public class ManagerServiceXML implements UserServiceXML {

    @Override
    public void saveName(String name) {
        System.out.println("For manager the name saved as :" + name);
    }

    @Override
    public void updateName(String name) {
        System.out.println("For manager the name updated to :" + name);
    }
}