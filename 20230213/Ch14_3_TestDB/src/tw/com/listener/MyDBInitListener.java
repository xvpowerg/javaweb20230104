package tw.com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.db.DbTools;

@WebListener
public class MyDBInitListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext context =  sce.getServletContext();
		String dbName = context.getInitParameter("dbName");
		String dbPaswword =context.getInitParameter("dbPaswword");
		DbTools.setAccount(dbName);
		DbTools.setPassword(dbPaswword);
	}
}
