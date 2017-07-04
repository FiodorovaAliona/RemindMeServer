package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.User;
import com.qoobico.remindme.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    @ResponseBody
    public User createUser
            (@RequestParam("username") String username,
             @RequestParam("email") String email,
             @RequestParam("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPass_hash(password);
        return userRepository.saveAndFlush(user);
            }

}