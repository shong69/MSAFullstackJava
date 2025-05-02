package com.mvc.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet{
	//로그 표시하기
//	Logger logger = Logger.getGlobal();  
	Logger logger = Logger.getLogger("com.mvc.controller.IndexController"); 
	// 로거의 주체가 누구인지에 대한 정보로 로거를 설정한다.
	
	/**
	 * DD에 index.do로 매핑된 welcome page를 main.jsp로 연동해주는 컨트롤러
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.setLevel(Level.WARNING); //로그 알림 설정 - warning 이상만 출력 -> getGlobal로 로거 생성 시 모든 로거에 설정됨
		logger.log(Level.INFO,"call IndexController..."); //log 메소드(로그레벨, 출력 문장)
		//Level 심각도 : trace > debug > info > warn > error > fatal 
		RequestDispatcher rd =req.getRequestDispatcher("main.jsp");
		rd.forward(req, resp); //포워딩하기
	}
}
