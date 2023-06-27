package com.ritesh.UserManagementSystemWithValidation.configuration;

import com.ritesh.UserManagementSystemWithValidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class BeanManager {
    @Bean
    public List<User> getInitialisedList(){
        List<User> uList = new ArrayList<>();
        User user = new User(0, "Ritesh", "31/12/2002" ,"ritesh@gmail.com", "8735967100", "27/6/2023", "12:00");

        uList.add(user);
        return uList;
    }
}
