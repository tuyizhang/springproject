package com.koalain.spring03.dao.implement;

import com.koalain.spring02.dao.UserDao;

public class MysqlUserDao implements UserDao {
    @Override
    public void addUser() {
        System.out.println("use mysql to add user.");
    }
}
