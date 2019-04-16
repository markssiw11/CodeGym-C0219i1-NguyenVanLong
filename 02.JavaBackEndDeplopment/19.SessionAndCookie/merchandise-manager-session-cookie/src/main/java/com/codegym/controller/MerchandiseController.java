package com.codegym.controller;

import com.codegym.model.Merchandise;
import com.codegym.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchandiseController {
    @Autowired
    private MerchandiseService merchandiseService;

    @GetMapping("/")
    public ModelAndView showMerchandise() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("merchandise", merchandiseService.findAll());
        return modelAndView;
    }

    @GetMapping("/merchandise/{id}/details")

    public ModelAndView showDetail(@PathVariable int id) {
        Merchandise merchandise =merchandiseService.findById(id);
        ModelAndView modelAndView = new ModelAndView("details");
        modelAndView.addObject("merchandise",merchandise);
        return modelAndView;
    }
    @GetMapping("/buy")
    public ModelAndView showBuy(@ModelAttribute("merchandise") Merchandise merchandise) {
        ModelAndView modelAndView = new ModelAndView("buy");
        Merchandise merchandise1= merchandiseService.findById(merchandise.getId());
        modelAndView.addObject("merchandise",merchandise1);
        System.out.println("merchandise:"+merchandise1.getId());
        System.out.println(merchandise1.getName());
        return modelAndView;
    }
}
