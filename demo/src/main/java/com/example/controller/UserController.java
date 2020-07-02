package com.example.controller;

import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping(value="")
    public ResponseEntity<?> getListUser(){
        return null;
    }
    @PostMapping(value="")
    public ResponseEntity<?> createUser(){
        return null;
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }
    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }
    
}