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
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//			
//	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String myAcc = "qwer";
		String myPwd = "12345";
		
		String acc =   req.getParameter("acc");
		String pwd = req.getParameter("pwd");
		//PrintWriter out = resp.getWriter();
//		out.println("acc:"+acc);
//		out.println("pwd:"+pwd);
		if (myAcc.equals(acc) && myPwd.equals(pwd)) {
				req.getRequestDispatcher("/pass").forward(req, resp);
		}else {
			   req.getRequestDispatcher("/fail").forward(req, resp);
		}
		
	}
}
