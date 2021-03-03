package com.kyocoolcool.mastermicroservices.user;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/3 4:27 PM
 */
@RestController
@Log
public class UserResource {
    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        log.info("find all users");
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        log.info("find users by id");
        return service.findOne(id);
    }
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User saveUser = service.save(user);
    }
}
