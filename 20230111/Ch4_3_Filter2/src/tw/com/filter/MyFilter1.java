package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/test/*")
public class MyFilter1 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {		
		System.out.println("MyFilter1 in");
		chain.doFilter(request, response);
		System.out.println("MyFilter1 out");
		
	}
	
}
