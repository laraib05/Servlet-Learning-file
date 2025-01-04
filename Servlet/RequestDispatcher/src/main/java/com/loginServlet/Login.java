package com.loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("name");
		String myName = req.getParameter("mail");
		String myPass = req.getParameter("pass");
//		System.out.println(myName+" "+myPass);
		PrintWriter out = resp.getWriter();
		
		if(myName.equals("laraib@gmail.com") && myPass.equals("laraib123")) {
			req.setAttribute("name_key", userName);
			RequestDispatcher rd = req.getRequestDispatcher("/welcome.jsp");
			rd.forward(req, resp);
		}else {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Wrong Email and Password try again plz</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
			rd.include(req, resp);
		}
	}
}
