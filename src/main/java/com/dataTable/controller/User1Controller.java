package com.dataTable.controller;

import com.dataTable.model.User;
import com.dataTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user1")
public class User1Controller {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> getAllUsers(){
        List<User> users1 = userService.getAllUsers();
        return users1;
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Integer id){
        return userService.getUser(id);
    }

//    @GetMapping("/{username}")
  //  public User getByUsername(@PathVariable String username){
    //    return userService.getUsername(username);
    //}


}
