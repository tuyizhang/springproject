package com.koalain.spring03.model;

public class UserFactory {
    public static User newInstance(String name){
        return new User(name);
    }
}
