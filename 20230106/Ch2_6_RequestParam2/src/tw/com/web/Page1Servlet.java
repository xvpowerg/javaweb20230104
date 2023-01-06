package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		String title = req.getParameter("title");
		String msg = req.getParameter("msg");
		out.println("<html>");
		out.println("<head>");
		if(title != null) {
			out.println("<title>");
			out.println(title);
			out.println("</title>");
		}
			
		out.println("</head>");
		
		out.println("<body>");
		if(msg != null) {
			out.println("<h2>");
			out.println(msg);
			out.println("</h2>");
		}
			
		out.println("</body>");
		out.println("</html>");
	}
}
