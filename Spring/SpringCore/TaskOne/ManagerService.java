package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class ManagerService implements UserService {

    @Override
    public void saveName(String name) {
        System.out.println("For manager the name saved as :" + name);
    }

    @Override
    public void updateName(String name) {
        System.out.println("For manager the name updated to :" + name);
    }
}