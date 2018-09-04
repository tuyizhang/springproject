package com.koalain.spring03.model;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    private String[] hobies;
    public void setHobies(String[] hobies){
        this.hobies=hobies;
    }

    private List<String> friends;
    public void setFriends(List<String> friends){
        this.friends=friends;
    }

    public Student(){

    }

    public Student(String name,String[] hobies,List<String> friends) {
        this.name = name;
        this.hobies = hobies;
        this.friends=friends;
    }

    public void show() {
        System.out.println("----");
        System.out.println("name:" + name );
        if(hobies.length>0)
            System.out.println("hobies:"+ Arrays.toString(hobies));
        if(friends.size()>0)
            System.out.println("friends:"+ friends.toString());

    }
}
