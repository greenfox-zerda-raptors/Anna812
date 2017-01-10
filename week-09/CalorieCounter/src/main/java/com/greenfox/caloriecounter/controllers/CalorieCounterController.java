package com.greenfox.caloriecounter.controllers;

import com.greenfox.caloriecounter.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anna on 17/01/10.
 */
@Controller
public class CalorieCounterController {

    @Autowired
    MealService mealService;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("meals", mealService.list());
        return "index";
    }
}
