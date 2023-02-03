package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.MyUser;


@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session =   req.getSession();
			String acc = "qwer";
			MyUser myUser =  new MyUser();
			myUser.setAccount(acc);
			session.setAttribute("acc", myUser);	
			resp.getWriter().println("Login");
			
		}
}
