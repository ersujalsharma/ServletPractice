package com.fourthproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class Add extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		int result = firstNumber+secondNumber;
		//Session
//		HttpSession session = req.getSession();
//		session.setAttribute("result", result);
		//Session
		//cookie
		Cookie cookie = new Cookie("result",result+"");
		res.addCookie(cookie);
		//cookie
		res.sendRedirect("square");
		
		
	}
}
