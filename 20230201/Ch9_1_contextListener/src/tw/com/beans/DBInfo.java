package tw.com.beans;

public class DBInfo {
	private static String dbName;
	private static String dbPassword;
	public static String getDbName() {
		return dbName;
	}
	 static void setDbName(String dbName) {
		DBInfo.dbName = dbName;
	}
	public static String getDbPassword() {
		return dbPassword;
	}
	 static void setDbPassword(String dbPassword) {
		DBInfo.dbPassword = dbPassword;
	}
	
	
}
