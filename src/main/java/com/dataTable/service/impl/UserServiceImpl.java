package com.dataTable.service.impl;

import com.dataTable.model.AppUser;
import com.dataTable.repository.AppUserRepository;
import com.dataTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AppUserRepository appUserRepository;


    @Override
    public AppUser save(AppUser appUser) {
        if (!Objects.isNull(appUser)) {
            return appUserRepository.save(appUser);
        }
        else return null;
    }


    @Override
    public AppUser getUser(Integer id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<AppUser> getAllUsers() {
        return (List<AppUser>) appUserRepository.findAll();
    }

    @Override
    public Optional<AppUser> getUsername(String username) {
        return appUserRepository.findByUsername(username);
    }
}
