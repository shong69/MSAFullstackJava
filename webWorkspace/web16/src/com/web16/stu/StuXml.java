package com.web16.stu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StuXml extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/xml"); //content type을 정해줘야 xml 형식으로 웹에 뜬다.(근데 안해도 브라우저가 알아서 띄워주고 있음)
		PrintWriter out =resp.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		
		out.println("<stus>");
		for (int i = 0; i < 5; i++) {
			out.println("<stu>");
			out.println("<num>"+(1000+i)+"</num>");
			out.println("<name>"+(1+i)+"</name>");
			out.println("<kor>"+(90+i)+"</kor>");
			out.println("<eng>"+(80+i)+"</eng>");
			out.println("<math>"+(70+i)+"</math>");
			out.println("</stu>");
		}
		out.println("</stus>");
		out.close();
	}
}
