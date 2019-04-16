package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public ModelAndView showForm(){
        Iterable<User> users =userService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }
    @PostMapping("/result")
    public ModelAndView showResult(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        userService.save(user);
        if(bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("user",new User());
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("user", new User());
        return modelAndView;

    }
}
