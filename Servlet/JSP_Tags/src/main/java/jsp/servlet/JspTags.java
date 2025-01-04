package jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jspTags")
public class JspTags extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Setting the response content type
        resp.setContentType("text/html");

        // Writing output to the response
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>JSP Tags from Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>JSP Tags Demonstration from Servlet</h1>");
        out.println("<p>This servlet demonstrates how JSP can be used alongside Servlets for dynamic content generation.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
