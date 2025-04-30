package com.web16.stu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StuJson extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("application/json"); //웹에서 보여줄 콘텐트 타입 지정
		int num=0;
		try {
			num= Integer.parseInt(req.getParameter("num"));			
		}catch (Exception e) { //값을 못받아오는 경우 num=0
		}
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		
		out.print("{\"stus\":[");//stu 배열 stus 초기화하기
		for (int i = num; i < num+4; i++) {
			if(i!=num)out.print(",");
			out.print("{\"num\" : 100"+i+","); //하나의 Object에 하나의 stu 
			out.print("\"name\" : \"user"+i+"\","); //하나의 Object에 하나의 stu 
			out.print("\"kor\" : 9"+i+","); //하나의 Object에 하나의 stu 
			out.print("\"eng\" : 8"+i+","); //하나의 Object에 하나의 stu 
			out.print("\"math\" : 7"+i+"}"); //하나의 Object에 하나의 stu 
		}
		out.print("]}");
		out.close();
	}
}
