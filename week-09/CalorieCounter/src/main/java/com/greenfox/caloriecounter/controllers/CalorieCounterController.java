package com.greenfox.caloriecounter.controllers;

import com.greenfox.caloriecounter.models.Meal;
import com.greenfox.caloriecounter.services.MealService;
import com.greenfox.caloriecounter.services.MealTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Anna on 17/01/10.
 */
@Controller
public class CalorieCounterController {

    @Autowired
    MealService mealService;
    @Autowired
    MealTypeService mealTypeService;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("meals", mealService.list());
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("mealtypes", mealTypeService.list());
        model.addAttribute("meal", new Meal());
        return "add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Meal meal) {
        mealService.saveMeal(meal);
        return "redirect:/index";
    }

    @RequestMapping("{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("meal", mealService.find(id));
        model.addAttribute("mealtypes", mealTypeService.list());
        return "add";
    }

    @RequestMapping("{id}/start-delete")
    public String askConfirmation(@PathVariable long id, Model model) {
        model.addAttribute("meal", mealService.find(id));
        return "confirm_deletion";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam long id) {
        mealService.delete(id);
        return "redirect:/index";
    }
}
