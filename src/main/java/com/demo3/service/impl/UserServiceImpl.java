package com.demo3.service.impl;

import com.demo3.dao.UserDao;
import com.demo3.model.User;
import com.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lichangjie on 01/12/2015.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @PostConstruct
    public void init(){
        System.out.println("------------->"+ (userDao == null));
    }

    @Override
    public User getUser(User user) {
        user= userDao.getUser(user);
        return user;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int UserId) {
        userDao.deleteUser(UserId);
    }
}
