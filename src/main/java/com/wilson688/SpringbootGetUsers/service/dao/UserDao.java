package com.wilson688.SpringbootGetUsers.service.dao;


import com.wilson688.SpringbootGetUsers.model.Users;

import java.util.List;

public interface UserDao {

/*
  find user information by given userid
 @param id

 @return User Details
 */
 Users findUser(String id);


 /*
 get all Users
 @return get all users
  */
 List<Users> getAllUsers();


 /*
 delete account
 @param id
  */
 void deleteUser(String id);

 /*
 update User
 @param User
 @return User
  */
 Users updateUser(Users user);

}
