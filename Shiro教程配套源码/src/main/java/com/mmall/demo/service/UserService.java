package com.mmall.demo.service;

import com.mmall.demo.model.User;

public interface UserService {

    User findByUsername(String username);
}
