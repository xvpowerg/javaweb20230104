package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] skillName= {"Empty","Java","Golang","CShape"};
			String[] skill = req.getParameterValues("skill");
			if (skill == null) {
				resp.getWriter().println(skillName[0]);	
				return;
			}
			for (String v : skill) {
				int index = Integer.parseInt(v);				
				resp.getWriter().println(skillName[index]);
			}
			
			
	}
		
}
