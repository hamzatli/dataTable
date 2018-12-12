package com.dataTable.service.impl;

import com.dataTable.model.User;
import com.dataTable.repository.UserRepository;
import com.dataTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        if (!Objects.isNull(user)) {
            return userRepository.save(user);
        }
        else return null;
    }


    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
