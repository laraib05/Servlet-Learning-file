package com.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/loginDetails")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myMail =  req.getParameter("mail");
		String myPass = req.getParameter("pass");
		System.out.println(myMail+" "+myPass);
	}
}
