package com.demo3.service;

import com.demo3.model.User;

import java.util.List;

/**
 * Created by lichangjie on 01/12/2015.
 */

public interface UserService {
    public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}
