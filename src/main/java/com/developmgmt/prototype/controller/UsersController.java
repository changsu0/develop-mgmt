package com.developmgmt.prototype.controller;

import com.developmgmt.prototype.model.Users;
import com.developmgmt.prototype.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    UserService userService;

    @Autowired
    Users users;

    @GetMapping("/hello")
    public String hello(Model model){
        users.setUserId("1");
        List<Users> usersList = userService.getAllUsers(users);

        model.addAttribute("message", "Hello111111");
        model.addAttribute("usersList", usersList);
        return "prototype/hello";
    }
/*
    @GetMapping("/hello")
    public String hello(Model model){

        Event event1 = new Event();
        event1.setName("changsoo1");
        event1.setStartTime(LocalDateTime.of(2020, 2, 19, 12, 12, 12));

        Event event2 = new Event();
        event2.setName("changsoo2");
        event2.setStartTime(LocalDateTime.of(2020, 2, 19, 12, 12, 12));


        List<Event> events = new ArrayList();
        events.add(event1);
        events.add(event2);

        model.addAttribute("events", events);
        model.addAttribute("message", "Hello");
        return "event/hello";

    }
    */
}
