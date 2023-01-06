package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
		public void init() throws ServletException {
			// TODO Auto-generated method stub
		System.out.println("init()");
		
		}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub	
		super.init(config);
		System.out.println("init(ServletConfig config)");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		ServletContext context = this.getServletContext();
		out.println("Page1:"+context);
	}

}
