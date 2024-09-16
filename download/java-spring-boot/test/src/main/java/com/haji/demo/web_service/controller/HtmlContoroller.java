package com.haji.demo.web_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/api")
public class HtmlContoroller {
    @GetMapping("hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") 
                        String name, Model model){
        model.addAttribute("name", name);
        /* http://localhost:8080/hello */
        // return "/hello.html";
        return "hello";
    }
    
}
