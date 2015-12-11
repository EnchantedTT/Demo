package com.demo3.mapper;

import com.demo3.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lichangjie on 03/12/2015.
 */
public interface UserMapper {
    public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}
