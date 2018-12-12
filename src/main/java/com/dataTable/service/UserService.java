package com.dataTable.service;

import com.dataTable.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User getUser(Integer id);

    List<User> getAllUsers();

    User getUsername(String username);

}
