package com.web16.step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet{
	ServletConfig config;
	
	@Override
	public void destroy() {
		System.out.println("destroy");
		//WAS 컨테이너 종료 시점에서 servlet 컨테이너 종료
	}

	@Override
	public ServletConfig getServletConfig() {
		//객체 생성 시 config를 init으로 넘겨준다 
		//
//		System.out.println("getServletConfig");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		//
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("init");
		//servlet 객체 생성 시점
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("service");
		//서비스 요청
//		res.setContentType("text/plain"); //html이 아닌 plain text로 콘텐트 타입 지정 -> 태그가 노출되어 나온다
		
		res.setContentType("text/html; charset=UTF-8");
		ServletOutputStream out = res.getOutputStream();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		
		out.print("</head>");
		out.print("<body>");
		out.write("<h1>test02 page</h1>".getBytes("utf-8"));
		out.print("<a href='test02.html'>test02 page</a>");
		out.print("</body>");
		out.print("</html>");

		out.close();
	}

}
