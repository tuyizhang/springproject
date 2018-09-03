package com.koalain.spring03.dao.implement;

import com.koalain.spring02.dao.UserDao;

public class OracleUserDao implements UserDao {
    @Override
    public void addUser() {
        System.out.println("use oracle to add user.");
    }
}
