package com.urlrewriting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Add extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		int result = firstNumber+secondNumber;
		//URL ReWriting
		res.sendRedirect("square?result="+result);
		//URL ReWriting
		
		
	}
}
