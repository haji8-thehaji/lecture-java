package com.haji.demo.spring_beginner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.haji.demo.spring_beginner.model.Lemp;
import com.haji.demo.spring_beginner.service.LempService;

@Controller
public class lempContorller {
    @Autowired
    LempService lempService;
    
    @GetMapping("/lemp")
    public String lampState(Model model){ 
		List<Lemp> lemps = lempService.getLemps();
		model.addAttribute("allLemps", lemps);
        return "lemp";
    }

	@GetMapping("/push_on/{id}")
	public String updateLampStateOn(@PathVariable("id") String id, Model model) {
		Lemp lemp = lempService.getLemp(id);
        lemp.on_button_pushed();
        // lemp.setLempState(ON.getInstance());
		return "redirect:/lemp";
	}
	@GetMapping("/push_off/{id}")
	public String updateLampStateOff(@PathVariable("id") String id, Model model) {
		Lemp lemp = lempService.getLemp(id);
        lemp.off_button_pushed();
		return "redirect:/lemp";
	}
}
