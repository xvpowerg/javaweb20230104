package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTools {
	private static String url = "jdbc:mysql://localhost:3306/test20230213?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
	private static String account;
	private static String password;
	public static String getAccount() {
		return account;
	}
	public static void setAccount(String account) {
		DbTools.account = account;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		DbTools.password = password;
	}
	public static String getUrl() {
		return url;
	}
	
	
	public static Connection getConnection() throws SQLException {
			Connection con = DriverManager.getConnection(url,
					account,password);
			return con;
	}
	
}
