package com.my.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.Controller;

public class InsertController implements Controller{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		return "redirect:./list"; // /bbs/insert로 들어가면 /bbs/list로 리다이렉트 하도록 함
	}
	
}
