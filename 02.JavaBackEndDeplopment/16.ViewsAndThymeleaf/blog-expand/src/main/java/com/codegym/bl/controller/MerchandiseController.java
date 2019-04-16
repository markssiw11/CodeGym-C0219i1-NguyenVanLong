package com.codegym.bl.controller;

import com.codegym.bl.model.Merchandise;
import com.codegym.bl.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchandiseController {
    @Autowired
    private MerchandiseService merchandiseService;
    @GetMapping("/list-merchandise")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("/merchandise/list");
        modelAndView.addObject("merchandise", new Merchandise());
        return modelAndView;
    }
}
