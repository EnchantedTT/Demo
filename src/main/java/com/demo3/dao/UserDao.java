package com.demo3.dao;

import com.demo3.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lichangjie on 01/12/2015.
 */
public interface UserDao {
    public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}
