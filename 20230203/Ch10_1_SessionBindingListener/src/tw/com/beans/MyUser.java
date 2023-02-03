package tw.com.beans;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MyUser  implements HttpSessionBindingListener {
	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
	   System.out.println("LoginTime:"+LocalDateTime.now());
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("LogoutTime:"+LocalDateTime.now());
	}
	
}
