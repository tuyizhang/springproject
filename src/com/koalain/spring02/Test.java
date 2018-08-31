package com.koalain.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans02.xml");
        //get bean from factory
        Hello hello=(Hello)(context.getBean("hello"));
        hello.show();
    }

}

