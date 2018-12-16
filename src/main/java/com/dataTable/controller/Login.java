package com.dataTable.controller;

import com.dataTable.model.User;
import com.dataTable.service.UserService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
public class Login {

    @Autowired
    private UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private Authentication authentication;

    public Login(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody User user) {
        System.out.println("SIGNUP REQUEST");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
    }


    @PermitAll
    @PostMapping("/test")
    public String test() {
        return "TEST IS WORKING";
    }

//
//    public String login(String username , String password){
//
//        authentication.ate
//
//
//    return null;
//    }
}


