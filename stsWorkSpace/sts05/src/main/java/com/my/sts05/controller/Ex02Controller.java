package com.my.sts05.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex02Controller {
	
	@RequestMapping(value="/ex11.do")
	public ModelAndView ex11() {
		return new ModelAndView("ex01", "msg","hello1");
	}
	
	
	@RequestMapping(value="/ex12.do")
	public String ex11(HttpServletRequest request) {
		request.setAttribute("msg", "hello2");
		return "ex01";
	}
	
	//매개변수로 Model만 받아오는 경우 
	@RequestMapping(value="/ex13.do")
	public String ex11(Model model) {
		model.addAttribute("msg", "HELLO3");
		return "ex01";
	}
	
	//매개변수로 String을 받아오는 경우
	//@RequestParam 아노테이션을 생략할 수 있다. @RequestParam(value="id") String id 임
	@RequestMapping(value="/ex14.do")
	public String ex12(String id, String pw, double su1) {
		System.out.println("param id: "+id);
		System.out.println("param pw: "+pw);
		System.out.println("param pw: "+su1);
		return "ex01";
	}
}
