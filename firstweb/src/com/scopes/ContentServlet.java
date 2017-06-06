package com.scopes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().println("<strong>This is Content servlet </strong>");
		System.out.println("This is Content servlet ");
		resp.getWriter().println(req.getAttribute("one"));
		Cookie cookie = new Cookie("onecons", "Gowtham");
		cookie.setMaxAge(600);
		resp.addCookie(cookie);
		
	}

}
