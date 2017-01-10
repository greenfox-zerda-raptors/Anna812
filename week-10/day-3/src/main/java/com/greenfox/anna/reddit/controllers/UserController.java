package com.greenfox.anna.reddit.controllers;

import com.greenfox.anna.reddit.models.Post;
import com.greenfox.anna.reddit.models.User;
import com.greenfox.anna.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anna on 17/01/06.
 */
@Controller
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/login")
    public String displayLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping("/login/auth")
    public String authenticateUser(@ModelAttribute User userToAuth) {
        if(service.isValidUser(userToAuth)) {
            return "redirect:/posts/user?userId=" + service.getUserId(userToAuth);
        } else {
            return "redirect:/";
        }
    }


}
