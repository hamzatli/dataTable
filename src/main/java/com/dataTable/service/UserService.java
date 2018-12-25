package com.dataTable.service;

import com.dataTable.model.AppUser;

import java.util.List;
import java.util.Optional;

public interface UserService {

    AppUser save(AppUser appUser);

    AppUser getUser(Integer id);

    List<AppUser> getAllUsers();

    Optional<AppUser> getUsername(String username);

}
