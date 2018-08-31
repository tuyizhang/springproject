package com.koalain.spring02;

public class Hello {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("hello,i'm " + name + ".");
    }
    public Hello(){
        System.out.println("Hello bean created.");
    }
}

