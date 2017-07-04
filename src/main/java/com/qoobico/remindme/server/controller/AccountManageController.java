package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.Help;
import com.qoobico.remindme.server.repository.HelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountManageController {
    @Autowired
    private HelpRepository repository;

    @RequestMapping(value = "/help", method = RequestMethod.GET)
    @ResponseBody
    public List<Help> getAllReminders() {
        return repository.findAll();
    }

}