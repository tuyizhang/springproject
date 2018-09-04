package com.koalain.spring03.model;

public class UserDynamicFactory {
    public User newInstance(String name){
        return new User(name);
    }
}
