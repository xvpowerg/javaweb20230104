package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.Shape;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String h = req.getParameter("h");
		String w = req.getParameter("w");
		Shape s = new Shape(Integer.parseInt(h),
							Integer.parseInt(w));
		req.setAttribute("myshape", s);
		req.getRequestDispatcher("/page2").forward(req, resp);
	}
}
