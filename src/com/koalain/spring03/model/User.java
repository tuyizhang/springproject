package com.koalain.spring03.model;

public class User {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    private int age;
    public void setAge(int age){
        this.age=age;
    }


    public void show() {
      System.out.println("name:" + name + ",age=" + age);
    }

    public User(){
        name="testUser";
        age=20;
    }

    public User(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
