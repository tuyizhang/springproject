package com.koalain.spring03.test;

import com.koalain.spring03.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/koalain/spring03/resource/beans.xml");
        //get bean from factory
        User user = (User)(context.getBean("user"));
        user.showName();
    }

}

