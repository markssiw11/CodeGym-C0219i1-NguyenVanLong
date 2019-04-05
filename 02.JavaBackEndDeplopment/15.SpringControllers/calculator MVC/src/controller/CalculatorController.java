package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CanculatorController {
    @GetMapping("/calculator")
    public String showCalculatorBoard() {
        return "index";
    }
    @PostMapping("/calculator")
    public String calculator(@RequestParam("condiment") String[] condiment){
        
    }
}
