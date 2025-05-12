package com.my.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.Controller;

public class IndexController implements Controller {
	//- FrontController에게 요청을 위임받기 때문에 HttpServlet을 상속받을 필요가 없어졌다.
	//- excute 메서드를 모든 컨트롤러에서 사용하여 FrontController에서 간편하게 사용하기 위해
	// Controller 인터페이스를 상속받아 execute 메서드를 오버라이딩하도록 한다.(다형성)
	
	public String execute(HttpServletRequest req, HttpServletResponse resp)  {
		return "index";
		//url 상에서 index.jsp를 직접호출하지 않도록 index.jsp의 위치를 WEB-INF 아래로 옮김
		//jsp가 아닌 url 포워딩으로 index.jsp 파일 내용을 볼 수는 있다.
		//FrontController에서 포워딩하도록 문자열만 리턴하도록 바꿈 (나머지 주소들은 공통 요소이므로 앞단에서 처리하기 쉽게)
	}
}
