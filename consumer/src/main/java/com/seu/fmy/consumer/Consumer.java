package com.seu.fmy.consumer;

import com.seu.fmy.common.model.User;
import com.seu.fmy.common.service.UserService;

public class Consumer {
    public static void main(String [] agrs) {
        UserService userService = null;
        User user = new User();
        user.setName("fmy");
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        }
        else{
            System.out.println("user == null");
        }

    }
}
