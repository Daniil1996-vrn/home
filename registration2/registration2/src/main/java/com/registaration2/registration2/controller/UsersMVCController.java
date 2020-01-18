package com.registaration2.registration2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.registaration2.registration2.entity.Users;
import com.registaration2.registration2.service.UsersService;

@Controller
@RequestMapping("/")
public class UsersMVCController {

    @Autowired
    UsersService service;

    @GetMapping("/registration")
    public String registration()
    {
        return "registration";
    }

    @RequestMapping(path = "/createUser", method = RequestMethod.POST)
    public String createUser(Users user)
    {
        service.createUser(user);
        return "redirect:/";
    }


}
