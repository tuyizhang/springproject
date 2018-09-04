package com.koalain.spring03.model;

import java.util.Arrays;

public class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    private String[] favorites;
    public void setFavorites(String[] favorites){
        this.favorites=favorites;
    }

    public Student(){

    }

    public Student(String name,String[] favorites) {
        this.name = name;
        this.favorites = favorites;
    }

    public void show() {
        System.out.println("----");
        System.out.println("name:" + name );
        if(favorites.length>0)
            System.out.println("favorites:"+ Arrays.toString(favorites));
    }
}
