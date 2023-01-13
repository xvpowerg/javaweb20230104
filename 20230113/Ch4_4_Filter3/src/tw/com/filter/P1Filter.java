package tw.com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/p1/*")
public class P1Filter extends HttpFilter {
	//限制登入才可閱讀的頁面
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpSession session =   req.getSession();
		Object obj = session.getAttribute("login");
		if (obj == null) {
			String toPage = "../p2/login.html";
			res.sendRedirect(toPage);
			return;
		}
		chain.doFilter(req, res);
	}
}
