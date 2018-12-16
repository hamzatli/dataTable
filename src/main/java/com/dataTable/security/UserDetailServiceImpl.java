package com.dataTable.security;

import com.dataTable.service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;


@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {


    private UserService userService;

    public UserDetailServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.dataTable.model.User user = userService.getUsername(username);
        return (UserDetails) new com.dataTable.model.User(  user.getUsername(), user.getPassword(), user.getRole() );
    }
}
