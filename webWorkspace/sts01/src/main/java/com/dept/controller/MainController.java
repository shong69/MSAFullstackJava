package com.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller {

	public MainController() {
		System.out.println("index controller °´Ã¼ »ý¼±");
	}
	/**
	 *ModelAndView : This class merely holds both to make it possible for 
	 *a controller to return both model and view in a single return value. 
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("call index.do");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

}
