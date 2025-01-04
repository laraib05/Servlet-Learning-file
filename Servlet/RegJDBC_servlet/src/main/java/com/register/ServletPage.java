package com.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regForm")
public class ServletPage extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("name");
		String userMail = req.getParameter("mail");
		String userPass = req.getParameter("pass");
		String userGender = req.getParameter("gender");
		String userCity = req.getParameter("city");
		
		System.out.println(userName+" "+userMail+" "+" "+userPass+" "+userGender+" "+userCity);
		
		try {
			System.out.println("s");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdb_ca6_3pm";
			String user = "root";
			String pass = "L@raib#17";
			System.out.println("second");
			Connection conn = DriverManager.getConnection(url,pass,user);
			System.out.println("Connection build");
			
		}catch(Exception e) {
			e.getMessage();
			System.out.println("not build");
		}
		
	}
}
