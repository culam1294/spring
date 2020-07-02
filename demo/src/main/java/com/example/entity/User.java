package com.example.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    public User(int i, String string, String string2, String string3, String string4, String string5) {
	}
	private int id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
    private String password;
}