package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	private ExecutorService es;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		es = Executors.newCachedThreadPool();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  resp.getWriter();
		Random ran = new Random();		
		LocalTime now =  LocalTime.now();
		out.println("Page1 Start:"+now);
		es.submit(()->{			
			System.out.println("======================");
			for(int i = 1;i<= 5;i++) {
				try {						
					TimeUnit.SECONDS.sleep(ran.nextInt(6)+1);
					System.out.println("Page1 Complete:"+now);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}					
			}
			System.out.println("======================");
			out.println("Page1 Finish:"+now);
		});
		
		
		out.println("Page1 End:"+now);

	}

}
