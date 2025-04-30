package com.web16.step03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex06 extends HttpServlet{
	//원하는 메서드 방식만 (doPost/doGet/doDelete/doPut..) 오버라이딩 해서 사용할 수 있다.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		ServletOutputStream out = res.getOutputStream();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h1>test04 page</h1>");
		out.println("<a href='test05?user=admin'>link</a>");
		out.println("<form action=\"test05\" method=\"post\">");
		out.println("<input name=\"user\"/>");
		out.println("<button>send</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
