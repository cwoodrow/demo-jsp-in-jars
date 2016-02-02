package com.serli.demo.jsp.in.jars.jsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = GET)
    public String get(Model model, @RequestParam(required = false) String name){
        String message = name == null? "World" : name;
        model.addAttribute("message", message);
        return "hello";
    }
}
