package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/view_image")
public class ViewImageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:", "test_image");
	List<String> fileNameList = Files.list(path).
		map(p->p.getFileName().toString()).
		collect(Collectors.toList());
	System.out.println(fileNameList);
		PrintWriter	out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
			for (String file :fileNameList) {
				out.println("<div>");
				out.println("<img width='30%' height='30%' src='/my_images/"+file+"'>");
				out.println("</div>");
			}
		
		out.println("</body>");
		out.println("</html>");
	
	}
}
