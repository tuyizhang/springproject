package com.koalain.spring03.test;

import com.koalain.spring03.model.Company;
import com.koalain.spring03.model.Student;
import com.koalain.spring03.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPAndC {
    public static void main(String[] args){
        //标签注入
        ApplicationContext context= new ClassPathXmlApplicationContext("com/koalain/spring03/resource/beansPAndC.xml");
        //p construct
        User user = (User)(context.getBean("user"));
        user.show();
        Company company = (Company) (context.getBean("company"));
        company.show();
        //c construct
        company = (Company) (context.getBean("companyShanghai"));
        company.show();
    }

}

