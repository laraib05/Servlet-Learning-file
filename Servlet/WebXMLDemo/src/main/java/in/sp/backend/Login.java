package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse respond) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		System.out.println("i am in service method");
	}
}
