package com.javaproject.shorturl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index.html";
    }

    @GetMapping("/r")
    public String demo(){
        return "demoRout.html";
    }
}