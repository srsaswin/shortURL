package com.javaproject.shorturl;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "hi from thymelea f");
        return "index";
    }
 
    @GetMapping("/r")
    public String demo(){
        return "demoRout";
    }
}