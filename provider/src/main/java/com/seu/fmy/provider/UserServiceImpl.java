package com.seu.fmy.provider;

import com.seu.fmy.common.model.User;
import com.seu.fmy.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名: " + user.getName());
        return user;
    }


}
