package com.polytechnics.demo.refrigerator.controller.ref;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String showMainPage(Model model) {
        model.addAttribute("userName", "홍길동");
        return "ref_main";
    }
}
