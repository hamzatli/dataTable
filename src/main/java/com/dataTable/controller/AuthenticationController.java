package com.dataTable.controller;


import com.dataTable.model.AppUser;
import com.dataTable.security.exceptions.AuthenticationException;
import com.dataTable.security.model.JwtUser;
import com.dataTable.security.model.dto.JwtAuthenticationRequest;
import com.dataTable.security.model.dto.JwtAuthenticationResponse;
import com.dataTable.security.service.AuthenticationService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    @Value("${jwt.header}")
    private String tokenHeader;

    private AuthenticationService authenticationService;

    @PostMapping("/signup")
    public AppUser save(@RequestBody AppUser appUser) {
        return authenticationService.save(appUser);
    }

    @DeleteMapping
    public String delete(){
        return "deleted";
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        return authenticationService.createAuthenticationToken(authenticationRequest);
    }

    @GetMapping("/signin")
    public JwtAuthenticationResponse refreshAndGetAuthenticationToken(HttpServletRequest request) {
        val authToken = request.getHeader(tokenHeader);
        return authenticationService.refreshToken(authToken);
    }


    @GetMapping("/user")
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        val authToken = request.getHeader(tokenHeader);
        return authenticationService.getUserByToken(authToken);
    }

    @ExceptionHandler({AuthenticationException.class})
    public ResponseEntity<String> handleAuthenticationException(AuthenticationException e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }

    @Autowired
    public void setAuthenticationService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
}
