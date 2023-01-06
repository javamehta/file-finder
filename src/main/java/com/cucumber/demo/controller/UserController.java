package com.cucumber.demo.controller;

import com.cucumber.demo.model.User;
import com.cucumber.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public User addUser(@RequestBody @Validated User user, BindingResult result) {
        System.out.println(result.getAllErrors().stream().findAny().get().getDefaultMessage());
        return userService.save(user);
       // return userService.save(User.builder().username("cvj").password("cvj").build());
    }

    @GetMapping("findAllUsers")
    public List<User> findAllUsers() {
        return userService.findAll();
    }

}
