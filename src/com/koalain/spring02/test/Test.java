package com.koalain.spring02.test;

import com.koalain.spring02.service.implement.UserServiceImplement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/koalain/spring02/resource/beans02.xml");
        //get bean from factory
        UserServiceImplement userService = (UserServiceImplement)(context.getBean("userService"));
        userService.addUser();
    }

}

