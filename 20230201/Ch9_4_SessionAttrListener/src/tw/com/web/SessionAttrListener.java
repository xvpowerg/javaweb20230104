package tw.com.web;

import java.time.LocalDateTime;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttrListener implements HttpSessionAttributeListener {
		@Override
		public void attributeAdded(HttpSessionBindingEvent event) {
			// TODO Auto-generated method stub
			 String name =  event.getName();
			 Object object =    event.getValue();
			 if (name.equals("acc")) {
				 System.out.println("acc:"+object);
				 System.out.println("Login Time:"+LocalDateTime.now());
			 }
			System.out.println("attributeAdded");
		}
		
		@Override
		public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
			HttpSession session =  event.getSession();
			String name = event.getName();
			Object obj = event.getValue();//會取得未修改前的值
			Object newObj = session.getAttribute(name);
			System.out.println("attributeReplaced:"+name+":"+obj+":"+newObj);
		}
		@Override
		public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
			//只有acc移除時需要顯示Logout Time
			String name = event.getName();
			if (name.equals("acc")) {
				 System.out.println("Logout Time:"+LocalDateTime.now());	
			}
			System.out.println("attributeRemoved:");
			
		}
		
}
