package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.polytechnics.demo.refrigerator.model.ref.Memo;
import com.polytechnics.demo.refrigerator.service.ref.MemoService;


@Controller
public class MemoController {
	@Autowired
	MemoService memoService;

	@GetMapping("/memo")
	public String memo(Model model) {
		List<Memo> memoList = memoService.getAllMemos();
		model.addAttribute("memoList", memoList);
		//System.out.println(memoList);
        return "refrigerator/memo";
	}
	@GetMapping("/new-memo")
	public String newMemo(Model model) {
		// List<Memo> memoList = memoService.getAllRecipes();
		// model.addAttribute("memoList", memoList);
		//System.out.println(memoList);
        return "refrigerator/new-memo";
	}

	@GetMapping("/isaga")
	public String isaga(Model model) {
		
		//System.out.println(memoList);
        return "haji/board/products-list";
	}

	@PostMapping("/addMemo")
	public String addMemo(Model model) {

		Memo m1=new Memo(13,"alpha",null,null);
		memoService.addMemo(m1);
		// List<Memo> memoList = memoService.getAllRecipes();
		// model.addAttribute("memoList", memoList);
		//System.out.println(memoList);
        return "redirect:/memo";
	}
}