package tw.com.cdi;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import tw.com.beans.MyApple;

public class MyProduces {
	@Produces
	@Named("redApple")
	private MyApple getReadApple() {
		MyApple myApple = new MyApple();
		myApple.setName("Red Apple");
		myApple.setPrice(100);
		return myApple;
	}
	
	
	@Produces
	@Named("QueryApples")
	private List<MyApple>queryAllApple(){
		List<MyApple> list = new ArrayList();
		MyApple app1 = new MyApple();
		MyApple app2 = new MyApple();
		
		app1.setName("A1");
		app1.setPrice(100);
		
		app2.setName("A2");
		app2.setPrice(200);
		list.add(app1);
		list.add(app2);
		return list;
	}
}
