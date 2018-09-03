package com.koalain.spring03.service.implement;

import com.koalain.spring02.dao.UserDao;
import com.koalain.spring02.service.UserService;

public class UserServiceImplement implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void addUser() {
        userDao.addUser();
    }
}
