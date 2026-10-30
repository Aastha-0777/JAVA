package jdbctopic.util;

import java.sql.Connection;
import java.sql.DriverManager;

//Database Connection
public class DBConnection {

	//1. Make Credential 
	
	private static final String URLNAME = "jdbc:mysql://localhost:3306/studentdb";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver"; //Driver class fetched form jdbc jar
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	//2. getConnection() Method
	
	public static void getConnectionM() {
		
		Connection conn = null;
		
		try {
			
			//3. Load Driver Class
			Class.forName(DRIVERCLASS);// This is optional
			
			//4. Pass Credentials --> DiverManager's getConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);			
			
			//5. Validate conn Object
			if(conn != null) {
				
				System.out.println("DB Connected : " + conn);
				
			}else {
				
				System.out.println("DB Not Connected : " + conn);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		
		DBConnection.getConnectionM();
		
	}
	
}
