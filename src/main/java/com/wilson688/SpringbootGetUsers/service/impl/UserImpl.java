package com.wilson688.SpringbootGetUsers.service.impl;

import com.wilson688.SpringbootGetUsers.model.Users;
import com.wilson688.SpringbootGetUsers.service.UserService;
import com.wilson688.SpringbootGetUsers.service.dao.UserDao;

import java.util.List;

public class UserImpl implements UserDao {

    private UserService userService;

    @Override
    public Users findUser(String id) {

        return userService.findUser(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public void deleteUser(String id) {
     return userService.deleteUser(id);
    }

    @Override
    public Users updateUser(Users user) {
        return userService.updateUser(user);
    }

}
