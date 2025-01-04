package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitform")
//@WebServlet("/aaa")
public class Login extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println("I m running without xml file");
//		
//		PrintWriter pw = arg1.getWriter();
//		pw.print("Yes we did");
		String name = request.getParameter("name1");
		String mail = request.getParameter("mail1");
		System.out.println(name+" "+mail);
		PrintWriter pw  = response.getWriter();
		pw.print(name);
		pw.print(mail);
	}

}
