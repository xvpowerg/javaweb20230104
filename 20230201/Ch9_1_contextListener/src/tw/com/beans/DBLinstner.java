package tw.com.beans;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class DBLinstner  implements ServletContextListener {
		
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext app = sce.getServletContext();
		DBInfo.setDbName(app.getInitParameter("dbName"));
		DBInfo.setDbPassword(app.getInitParameter("dbPaswword"));
		
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
}
