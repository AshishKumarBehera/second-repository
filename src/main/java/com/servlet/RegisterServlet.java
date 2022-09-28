package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("user_name");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		String course= req.getParameter("course");
		
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		out.print("<h1>Name: "+ name +"</h1>"); 
		out.print("<h1>email: "+ email +"</h1>");
		out.print("<h1>password: "+ password +"</h1>");
		out.print("<h1>course: "+ course +"</h1>");
	}

}
