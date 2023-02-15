package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.db.DbTools;
import tw.com.db.MySqlUser;
import tw.com.db.UserDao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String url = "jdbc:mysql://localhost:3306/test20230213?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//		String user = "root";
//		String password = "123456";
//		try(Connection con =  DriverManager.getConnection(url,user,password)){
//			
//		}catch(SQLException ex) {
//			System.out.println(ex);
//		}
//		try(Connection conn =   DbTools.getConnection();
//			Statement stm = conn.createStatement();) {
//			stm.executeUpdate("INSERT INTO .....");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
		
		UserDao userDao = new MySqlUser();
		boolean login =  userDao.login("asdf", "123456");
		System.out.println(login);
		boolean b1 =  userDao.regisrter("asdf", "123456");
		System.out.println(b1);
		
	}
}
