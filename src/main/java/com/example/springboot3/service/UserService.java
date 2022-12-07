package com.example.springboot3.service;

import com.example.springboot3.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void removeUserById(Integer id);
    User getUserById(Integer id);
    List<User> getAllUsers();
    User getUserByName(String username);
}
