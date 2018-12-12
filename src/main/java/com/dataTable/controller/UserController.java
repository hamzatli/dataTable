package com.dataTable.controller;

import com.dataTable.model.User;
import com.dataTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user){
      return userService.save(user);
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable Integer id){

        return userService.getUser(id);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }


}
