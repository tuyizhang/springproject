package com.koalain.spring03.test;

import com.koalain.spring03.model.Address;
import com.koalain.spring03.model.Company;
import com.koalain.spring03.model.Student;
import com.koalain.spring03.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/koalain/spring03/resource/beans.xml");
        //get bean from factory
        User user = (User)(context.getBean("user"));
        user.show();

        User userWithPars = (User)(context.getBean("userWithPars"));
        userWithPars.show();

        User userWithPars2 = (User)(context.getBean("userWithPars2"));
        userWithPars2.show();

        User userWithFactory = (User)(context.getBean("userWithFactory"));
        userWithFactory.show();

        User userWithFactoryDynamic = (User)(context.getBean("userWithDynamicFactory"));
        userWithFactoryDynamic.show();


        Company company = (Company) (context.getBean("company"));
        company.show();

        Student student = (Student)(context.getBean("student"));
        student.show();

        Student studentfromlist = (Student)(context.getBean("studentfromlist"));
        studentfromlist.show();

    }

}

