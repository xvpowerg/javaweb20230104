package tw.com.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.nio.file.Path;
import java.nio.file.Paths;

//?i?W??
@MultipartConfig
@WebServlet("/upload")
public class UploadServlet  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part  =  req.getPart("photo");
		String fileName = part.getSubmittedFileName();
		
		System.out.println(fileName);
		Path imagPath = Paths.get("C:","test_image",fileName);
		File outFile = imagPath.toFile();
		try(InputStream inputStr = part.getInputStream();
		FileOutputStream out = new FileOutputStream(outFile)){
			byte[] cache = new byte[1024];
			int index = -1;
			while( (index = inputStr.read(cache)) != -1) {
				out.write(cache,0,index);
			}			
		}
		resp.sendRedirect("view_image");
	}
}
