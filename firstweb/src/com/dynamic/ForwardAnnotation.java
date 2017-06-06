package com.dynamic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Annotation1", urlPatterns = "/forward")
public class ForwardAnnotation  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("first Annotation..");
		
		RequestDispatcher rdone = req.getRequestDispatcher("/header");
		rdone.include(req, resp);
		resp.getWriter().println("<b>Forward Annotation</b>");
		RequestDispatcher rdtwo = req.getRequestDispatcher("/footer");
		rdtwo.include(req, resp);
	}

}
