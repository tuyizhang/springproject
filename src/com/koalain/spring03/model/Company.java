package com.koalain.spring03.model;

public class Company {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    private Address address;
    public void setAddress(Address address){
        this.address=address;
    }

    public Company(String name, Address address){
        this.name=name;
        this.address=address;
    }
    public Company(){}

    public void show() {
        System.out.println("----");
        System.out.println("name:" + name );
        System.out.println("address=" + address);
    }

}
