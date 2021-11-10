package com.generation.SpringSecurityJWT.controller;

import com.generation.SpringSecurityJWT.model.User;
import com.generation.SpringSecurityJWT.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }


}
