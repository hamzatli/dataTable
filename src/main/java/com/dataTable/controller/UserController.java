package com.dataTable.controller;

import com.dataTable.model.AppUser;
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
    public AppUser save(@RequestBody AppUser appUser){
      return userService.save(appUser);
    }

    @GetMapping("/get/{id}")
    public AppUser getUser(@PathVariable Integer id){

        return userService.getUser(id);
    }

    @GetMapping("/get")
    public List<AppUser> getAllUser(){
        return userService.getAllUsers();
    }


}
