package com.userservice.controller;

import com.userservice.entity.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * RestTemplate used to communicate one microservice to another microservice
     */
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("/{userId}")
    public User getUserInfo(@PathVariable("userId") Long userId){
        // http://localhost:1002/contact/1003
        User user=userService.getUser(userId);
        user.setContacts(restTemplate.getForObject("http://contact-service/contact/"+user.getUserId(), List.class));
        return user;
    }
}
