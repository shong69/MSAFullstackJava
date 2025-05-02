package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.BbsDao;

public class DeleteController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		
		BbsDao dao = new BbsDao();
		int result = dao.deleteOne(num);
		if(result>0)
			resp.setStatus(HttpServletResponse.SC_OK); //성공 코드만 응답
		else resp.sendError(HttpServletResponse.SC_BAD_REQUEST); //에러화면까지
	}
}
