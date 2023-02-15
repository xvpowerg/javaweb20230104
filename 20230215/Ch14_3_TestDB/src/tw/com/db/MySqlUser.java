package tw.com.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import tw.com.beans.MyUser;

public class MySqlUser implements UserDao {

	@Override
	public boolean login(String account, String password) {
			try(Connection conn =  DbTools.getConnection();
					PreparedStatement stem = 
							conn.prepareStatement("SELECT * FROM user_info "
					+ "WHERE account = ? AND password = ?");){
				stem.setString(1, account);
				stem.setString(2, password);
				ResultSet res = 	 stem.executeQuery();
				if (res.next()) {
					return true;
				}
			}catch(SQLException ex) {
				System.out.println("ex:"+ex);
			}
		
		
		return false;
	}

	@Override
	public boolean regisrter(String account, String password) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO user_info(account,password) VALUES(?,?)";
		try(Connection  con =  DbTools.getConnection();
			PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1,account);
			stm.setString(2, password);
			int count = stm.executeUpdate();
			return count > 0;
		}catch(SQLException ex) {
			System.out.println(ex);
		}
				
		return false;
	}

	@Override
	public MyUser findUserByAccount(String account) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user_info WHERE account = ?";
		
		try(Connection  con =  DbTools.getConnection();
			PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, account);
			ResultSet result =  stm.executeQuery();
			if (result.next()) {
				int id = result.getInt(1);
				String resAccount = result.getString(2);
				String password = result.getString(3);
				MyUser myUser = new MyUser();
				myUser.setId(id);
				myUser.setAccount(resAccount);
				myUser.setPassword(password);
				return myUser;
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return null;
	}

}
