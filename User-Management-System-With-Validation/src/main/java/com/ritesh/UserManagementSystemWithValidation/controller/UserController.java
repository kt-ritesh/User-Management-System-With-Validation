package com.ritesh.UserManagementSystemWithValidation.controller;

import com.ritesh.UserManagementSystemWithValidation.model.User;
import com.ritesh.UserManagementSystemWithValidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@Valid @RequestBody User user){
        return userService.AddUser(user);
    }

    @GetMapping("getUser/{uId}")
    public User getAUser(@PathVariable Integer uId){
        return userService.getUser(uId);
    }

    @GetMapping("getUsers")
    public List<User> getAllUser(){
        return userService.GetAllUser();
    }

    @PutMapping("updateUser/{uId}")
    public String updateUser(@Valid @RequestBody User user, @PathVariable Integer uId){
        return userService.UpdateUser(user, uId);
    }

    @DeleteMapping("deleteUser/{uId}")
    public String deleteUser(@PathVariable Integer uId){
        return userService.DeleteUser(uId);
    }
}
