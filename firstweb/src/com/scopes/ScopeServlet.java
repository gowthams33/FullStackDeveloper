package com.scopes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().println("<strong>This is Scope servlet </strong>");
		System.out.println("This is Scope servlet ");
		HttpSession session = req.getSession(true);
		req.setAttribute("one", "This is key value of attribute");
		ServletContext context = req.getServletContext();
		context.setAttribute("onecontext", "servletcontext");
		session.setAttribute("onesession", "httpsession");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/request");
		dispatcher.forward(req, resp);
	}

}
