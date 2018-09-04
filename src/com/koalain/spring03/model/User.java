package com.koalain.spring03.model;

import java.util.Arrays;

public class User {
    private String name;
    private int age;
    public User(){
        name="testUser";
        age=20;
    }

    public User(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void show() {
        System.out.println("----");
        System.out.println("name:" + name + ",age=" + age);
    }
}
