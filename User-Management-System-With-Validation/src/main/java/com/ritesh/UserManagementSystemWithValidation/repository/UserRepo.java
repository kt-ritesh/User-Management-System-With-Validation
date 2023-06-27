package com.ritesh.UserManagementSystemWithValidation.repository;

import com.ritesh.UserManagementSystemWithValidation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    List<User> userList;

    public List<User> AllUser() {
        return userList;
    }
}
