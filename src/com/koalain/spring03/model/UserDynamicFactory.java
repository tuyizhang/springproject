package com.koalain.spring03.model;

public class UserDynamicFactory {
    public User newInstance(String name,int age){
        return new User(name,age);
    }
}
