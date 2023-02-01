package tw.com.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class RequestListener implements ServletRequestListener{
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("requestInitialized");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequest sreq =   sre.getServletRequest();
		System.out.println("requestDestroyed:"+
					sreq.getAttribute("myAttr"));
	}
}
