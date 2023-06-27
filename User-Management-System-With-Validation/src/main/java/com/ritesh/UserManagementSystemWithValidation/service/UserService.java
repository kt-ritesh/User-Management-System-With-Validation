package com.ritesh.UserManagementSystemWithValidation.service;

import com.ritesh.UserManagementSystemWithValidation.model.User;
import com.ritesh.UserManagementSystemWithValidation.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public List<User> GetAllUser() {
        return userRepo.AllUser();
    }

    public String AddUser(User user) {
        List<User> list = GetAllUser();
        list.add(user);

        return "User added successfully!!!!";
    }

    public String AddUsers(List<User> users) {
        List<User> list = GetAllUser();
        list.addAll(users);

        return "Users added successfully!!!!";
    }

    public User getUser(Integer uId) {
        List<User> list = GetAllUser();
        for(User user : list){
            if(user.getUserId().equals(uId)){
                return user;
            }
        }
        return null;
    }

    public String UpdateUser(User user, Integer uId) {
        List<User> list = GetAllUser();
        for (User u : list){
            if(u.getUserId().equals(uId)){
                u.setUserId(user.getUserId());
                u.setUserName(user.getUserName());
                u.setUserDOB(user.getUserDOB());
                u.setUserEmail(user.getUserEmail());
                u.setUserPhone(user.getUserPhone());
                u.setDate(user.getDate());
                u.setTime(user.getTime());

                return "User updated Successfully!!";
            }
        }
        return "User Not found!!";
    }

    public String DeleteUser(Integer uId) {
        List<User> list = GetAllUser();
        for (User u : list){
            if(u.getUserId().equals(uId)){
                list.remove(u);
                return "User Deleted!";
            }
        }
        return "User not found!";
    }

}
