package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//asyncSupported 非同步適合AJAX
@WebServlet(urlPatterns = {"/page1"},asyncSupported = true)
public class Page1Servlet extends HttpServlet{
	private 	Random ran = new Random();
	private ExecutorService es;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		es = Executors.newCachedThreadPool();
	}
	private String getMyString() {
		try {
			TimeUnit.SECONDS.sleep(ran.nextInt(5)+1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = "";
		int len = ran.nextInt(128)+1;
				
		for (int i = 1;i <= len;i++) {
			int type = ran.nextInt(2);
			int offSet = ran.nextInt(26);
			char first =  type == 0?'A':'a';	
			first+=offSet;
			str+=first;	
		}
		
		return str;
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
			
		// PrintWriter  out =   resp.getWriter();
		 AsyncContext ctx = req.startAsync();
		 es.execute(()->{			
			try {
				 PrintWriter out  = ctx.getResponse().getWriter();
				out.println(getMyString());
			} catch (IOException e) {
				System.out.println(e);
			}finally{
				 ctx.complete();
			}
			 
			
		 });
		
	}
}
