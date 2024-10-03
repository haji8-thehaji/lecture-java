package com.haji.demo.thymeleaf_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HtmlController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "index.html";
    }
    @GetMapping("/ecommerce")
    public String ecommerce() {
        return "pages/ecommerce/overview.html";
    }
}