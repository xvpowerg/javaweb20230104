package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.Shape;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Shape s =   (Shape)req.getAttribute("myshape");
		String msg = String.format("H:%.2f W:%.2f A:%.2f", 
				s.getHeigth(),s.getWidth(),s.getArea()); 
		resp.getWriter().println(msg);
	}
}
