package tw.com.web.tools;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitContextListener implements ServletContextListener{
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			// TODO Auto-generated method stub
			String image_path = 
					sce.getServletContext().
					getInitParameter("image_path");
			
			System.out.println("InitContextListener:"+image_path);
			ImageTools.setImagePath(image_path);
			
		}
}
