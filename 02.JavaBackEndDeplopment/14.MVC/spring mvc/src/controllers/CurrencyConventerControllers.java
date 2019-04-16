package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConventerControllers {
    @GetMapping("/conventing")
    public String showcurrencyConventing() {
        return "index";
    }
    @PostMapping("/conventing")
    public String currencyConventing(@RequestParam double usd, Model model) {
        double vnd =usd*23000;
        model.addAttribute("vnd",vnd);
        return "result";
    }
}
