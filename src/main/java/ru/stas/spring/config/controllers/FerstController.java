package ru.stas.spring.config.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

@Controller
public class FerstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){


        //System.out.println("Hello," + name + " " +surname);
        model.addAttribute("message","Hello," + name + " " +surname);

        return "first/hello";


    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";

    }

    @GetMapping("/colculator")
    public String colculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model){
        double result;

        switch (action){
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / (double)b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case  "addition":
                result = a+b;
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("result",result);
        return "first/colculator";
    }
}
