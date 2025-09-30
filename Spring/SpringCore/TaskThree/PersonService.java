package com.spring.core;

public class PersonService implements UserService {

    @Override
    public void saveName(String name) {
        System.out.println("For person the name saved as :" + name);
    }

    public void initMethod(){
        System.out.println("Start");
    }

    public void destMethod(){
        System.out.println("Finish");
    }
}