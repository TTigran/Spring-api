package com.example.springapi.api.controller;

import com.example.springapi.api.model.User;
import com.example.springapi.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin()
@RequestMapping("/api/users")
@Api(tags = "Users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Get User by Id")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}
