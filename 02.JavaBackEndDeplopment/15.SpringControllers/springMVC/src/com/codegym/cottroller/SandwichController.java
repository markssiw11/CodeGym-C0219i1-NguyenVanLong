package com.codegym.cottroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/condiment")
    public String save(@RequestParam("condiment") String[] condiment) {
        return "index";
    }
}
