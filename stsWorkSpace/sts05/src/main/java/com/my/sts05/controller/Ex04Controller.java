package com.my.sts05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex04Controller {
	
	@RequestMapping("{msg1}/{msg2}/ex31.do")
	public String ex01(@PathVariable("msg1") String msg1, 
			@PathVariable String msg2,  //넘어오는 값과 지정해주는 값이 같다면 생략이 가능하다.(기본이 @RequestParam이기 때문에 어노테이션 생략은 불가함)
			Model model) {
		model.addAttribute("msg", msg1);
		model.addAttribute("msg2", msg2);
		return "ex01";
	}
}
