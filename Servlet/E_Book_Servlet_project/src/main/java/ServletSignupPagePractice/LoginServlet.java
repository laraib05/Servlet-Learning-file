package ServletSignupPagePractice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginMail = req.getParameter("user");
		String loginPass = req.getParameter("pass");
		
		System.out.println("login details : "+loginMail+" "+loginPass);
		
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession(false);
		
		String signUserName = (String) session.getAttribute("userName");
        String signUserMail = (String) session.getAttribute("userMail");
        String signUserPass = (String) session.getAttribute("userPass");
        System.out.println("Sign up details : "+signUserMail+" "+signUserName+" "+signUserPass);//we are recieving the details from signup page
        
        if(loginMail.equals(signUserMail) && loginPass.equals(signUserPass)) {
        resp.sendRedirect("Product.jsp");
        }
        else {
        	resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Email or password is wrong</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
        }
		
	}
}
