package com.koalain.spring03.model;

public class UserFactory {
    public static User newInstance(String name,int age){
        return new User(name, age);
    }
}
