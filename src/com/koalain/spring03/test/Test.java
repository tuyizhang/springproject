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
        User userWithPars = (User)(context.getBean("userWithPars"));
        userWithPars.showName();

        User userWithPars2 = (User)(context.getBean("userWithPars2"));
        userWithPars2.showName();

        User userWithPars3 = (User)(context.getBean("userWithPars3"));
        userWithPars3.showName();

        User userWithFactory = (User)(context.getBean("userWithFactory"));
        userWithFactory.showName();

        User userWithFactoryDynamic = (User)(context.getBean("userWithDynamicFactory"));
        userWithFactoryDynamic.showName();

    }

}

