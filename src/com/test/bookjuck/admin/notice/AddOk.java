package com.test.bookjuck.admin.notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/notice/addOk.do")
public class AddOk extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/admin/notice/addOk.jsp");
//		dispatcher.forward(req, resp);
	}

}