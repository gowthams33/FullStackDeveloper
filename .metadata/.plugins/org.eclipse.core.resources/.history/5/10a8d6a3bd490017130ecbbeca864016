package com.scopes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().println("<strong>This is Request servlet </strong>");
		System.out.println("This is Request servlet ");
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/content");
		dispatcher.forward(req, resp);
	}

}
