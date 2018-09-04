package com.koalain.spring03.model;

public class Address {
    private String city;
    public void setCity(String city){
        this.city=city;
    }
    private String detail;
    public void setDetail(String detail){
        this.detail=detail;
    }

    public Address(String city,String detail){
        this.city=city;
        this.detail=detail;
    }
    public Address(){}

    @Override
    public String toString() {
        return (city + detail);
    }
}
