package com.example.service;

import java.util.ArrayList;

import com.example.entity.User;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();
    static {
        users.add(new User(1, "Nguyen Van Hoa", "hoahoa@gmail.com", "0959777585", "avatar.img", "12e5t"));
        users.add(new User(2, "Nguyen Van Trung", "hoahoa@gmail.com", "0959777585", "avatar.img", "12e5t"));
        users.add(new User(3, "Nguyen Van Nam", "hoahoa@gmail.com", "0959777585", "avatar.img", "12e5t"));
        users.add(new User(4, "Nguyen Van Tien", "hoahoa@gmail.com", "0959777585", "avatar.img", "12e5t"));

    }

}