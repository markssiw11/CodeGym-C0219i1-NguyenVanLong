package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class CalculatorController {
    @GetMapping("/calculator")
    public String showCalculatorBoard() {
        return "index";
    }

    @RequestMapping("/calculator")
    public String calculator(@RequestParam("firstOperand") String firstOperand,
                             @RequestParam("secondOperand") String secondOperand,
                             @RequestParam("operator") String operator,
                             Model model) {
        float first = Float.parseFloat(firstOperand);
        float second = Float.parseFloat(secondOperand);
        model.addAttribute("first",first);
        model.addAttribute("second",second);
        float result = Calculator.calculate(first,second,operator);
        model.addAttribute("operator",operator);
        model.addAttribute("result",result);
        return "index";

    }
}