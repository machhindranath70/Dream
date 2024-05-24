package com.example.main.service;

import com.example.main.entity.User;

public interface UserService {
    User registerUser(User user);
    boolean isUserExist(String email);
}
