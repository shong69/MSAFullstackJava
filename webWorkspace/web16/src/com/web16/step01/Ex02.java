package com.web16.step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex02 implements Servlet {
	ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "~~";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		ServletOutputStream out = res.getOutputStream();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"utf-8\">");
		
		out.print("</head>");
		out.print("<body>");
		out.write("<h1>test02 page</h1>".getBytes("utf-8"));
		out.print("</body>");
		out.print("</html>");

		out.close();

	}

}
