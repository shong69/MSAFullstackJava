package com.my.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.my.model.DeptDao;

public class ListController implements Controller {
	DeptDao dao; //인터페이스로 의존성 추가 후 controller 객체 생성할 때 구현체로 dao 주입(-servlet.xml에서 지정)
	public void setDao(DeptDao dao) {
		this.dao = dao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("dept/list", "list", dao.selectAll());
	}

}
