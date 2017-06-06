package com.dynamic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Second servlet class");
		resp.getWriter().println("<h1> This is Second servlet</h1>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/third");
		dispatcher.forward(req, resp);
		
		
	}
}
