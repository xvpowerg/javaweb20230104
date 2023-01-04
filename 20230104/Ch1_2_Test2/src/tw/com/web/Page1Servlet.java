package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {

	//HttpServletRequest ­t³d¿é¤J
	//HttpServletResponse ­t³d¿é¥X
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		out.println("Page1");
		
	}
	
}
