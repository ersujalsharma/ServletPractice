package com.fourthproject;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class Square extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		HttpSession session = req.getSession();
//		
//		int result = (int)session.getAttribute("result");
		int result=0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c :cookies) {
			if(c.getName().equals("result")) 
			{
				result = Integer.parseInt(c.getValue());
			}
		}
		result = result*result;
		PrintWriter out = res.getWriter();
		out.println("Result is "+result);
	}

}
