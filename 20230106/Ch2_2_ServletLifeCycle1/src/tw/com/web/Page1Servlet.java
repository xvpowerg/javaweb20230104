package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	private int[] values = new int[10000];
	private Random r = new Random();
	public void init()throws ServletException {
		
		for (int i = 0;i < values.length;i++) {
			values[i] = r.nextInt(50000)+1;
		}
		System.out.println("Page1Servlet Init");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =   resp.getWriter();
		out.println("Page1:"+values[r.nextInt(10000)]);
			
	}
}
