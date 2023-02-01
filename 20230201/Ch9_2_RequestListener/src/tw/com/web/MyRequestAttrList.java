package tw.com.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttrList implements ServletRequestAttributeListener{
		@Override
		public void attributeAdded(ServletRequestAttributeEvent srae) {
			// TODO Auto-generated method stub
			System.out.println("attributeAdded!!");	
		}
		@Override
		public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
			System.out.println("attributeReplaced!!");			
		}
		@Override
		public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
			System.out.println("attributeRemoved!!");	
		}
}
