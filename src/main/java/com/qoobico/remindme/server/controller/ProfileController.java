package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.User;
import com.qoobico.remindme.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/userinfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable("id") long id) {
        return userRepository.findOne(id);
    }

    @RequestMapping(value = "/user/change/name", method = RequestMethod.POST)
    @ResponseBody
    public User createUser
            (@RequestParam("id") String id,
             @RequestParam("username") String username) {
        User user = userRepository.findOne(Long.parseLong(id));
        user.setUsername(username);
        return userRepository.saveAndFlush(user);
    }
}