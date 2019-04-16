package com.codegym.cottroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
public class SandwichController {
    @GetMapping(value = "/condiment")
    public String showCondiment() {

        return "index";
    }
    @RequestMapping(value = "/condiment")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        if(condiment.length==1) {
            return "error";
        } else {
            model.addAttribute("condiment",condiment);
            return "complete";
        }

    }
}
