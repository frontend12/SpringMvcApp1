package ru.stas.spring.config.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FerstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";


    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";

    }
}
