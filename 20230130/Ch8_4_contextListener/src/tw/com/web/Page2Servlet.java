package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page2")
public class Page2Servlet  extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		ServletContext app =    this.getServletContext();
		 String acc =  (String)app.getAttribute("dbacc");
		  String pwd = (String)app.getAttribute("dbpwd");
		  PrintWriter out = resp.getWriter();
		  out.println("Page1:"+acc+":"+pwd);
		}
}
