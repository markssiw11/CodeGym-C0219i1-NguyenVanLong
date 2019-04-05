package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SimpleDictionaryControllers {
    @GetMapping("/translate")
    public String showSimpelDictionary(){
        return "index";
    }
    @PostMapping("/stranslate")
    public String simpleDictionary(@RequestParam String english, Model modle ) {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("table","ban");
        dictionary.put("book","sach");
        dictionary.put("phone", "dien thoai");
        if(english!=null) {
            return "result";
        }
        return "result";
    }
}
