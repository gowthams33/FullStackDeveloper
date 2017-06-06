package com.dynamic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "first", urlPatterns = "web")

public class AnnoServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init ()");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter prt = resp.getWriter();
		prt.println("<input type ='text'> "+new Date());
		System.out.println("doGet  ()");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		System.out.println("dopost () ");
		out.println("<h1> Name = "+req.getParameter("na")+" Age = "+req.getParameter("age")+"</h1>"); 
		Enumeration<String> parametername = req.getHeaderNames();
		while(parametername.hasMoreElements()){
			Enumeration<String> headerValue = req.getHeaders(parametername.nextElement());
			while(headerValue.hasMoreElements())
				out.println(headerValue.nextElement());
		}
		
		//RequestDispatcher rd = req.getRequestDispatcher("/sec");
		//rd.forward(req, resp);
		
	}
}
