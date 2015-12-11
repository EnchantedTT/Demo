package com.demo3.dao.impl;

import com.demo3.dao.UserDao;
import com.demo3.mapper.UserMapper;
import com.demo3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by lichangjie on 03/12/2015.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(User user) {
        user= userMapper.getUser(user);
        return user;
    }

    @Override
    public void addUser(User user) {
        System.out.println("in impl");
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(int UserId) {
        userMapper.deleteUser(UserId);
    }
}