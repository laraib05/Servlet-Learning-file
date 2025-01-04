package ServletLoginPagePractice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/signup")
public class SignupServletPage extends HttpServlet{
	public String userName,userMail,userPass;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 userName = req.getParameter("user");
		 userMail = req.getParameter("mail");
		 userPass = req.getParameter("pass");
		 
		System.out.println("sign up details : "+userMail+" "+userName+" "+userPass);
		PrintWriter out = resp.getWriter();
//		pw.print("lolol");
		
		HttpSession session =  req.getSession();
		session.setAttribute("userName", userName);
        session.setAttribute("userMail", userMail);
        session.setAttribute("userPass", userPass);
		
		
			if(userName != null && !userName.isEmpty() && userMail != null && !userMail.isEmpty() && userPass != null && !userPass.isEmpty()){
//				RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
				
				resp.sendRedirect("login.jsp");
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>Please fill the required details</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/SignUp.jsp");
				rd.include(req, resp);
			}
		
		
		
	}
}
