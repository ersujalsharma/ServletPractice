package com.first.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));	
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a+b;
	
		PrintWriter out = res.getWriter();
		
		out.println("Result is "+result);
		
		
	}

}
