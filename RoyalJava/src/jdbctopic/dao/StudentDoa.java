package jdbctopic.dao;

import java.sql.Connection;
import java.sql.Statement;

import jdbctopic.util.DBConnection;

public class StudentDoa {

	public int insertStudent() {

		int affectedRows = 0;
		String insertQuery = "INSERT INTO student(name, std, marks) VALUES('Aastha Lakhatariya', 12, 100)";
		Statement stmt = null;
		
		//1. get Connection
		Connection conn = DBConnection.getConnectionM();
		
		//2. Validate Connection
		if(conn != null) {
			
			try {
				
				//3. Create statement obj
				stmt = conn.createStatement();
				
				//4. execute query
				affectedRows = stmt.executeUpdate(insertQuery);
				
			} catch (Exception e) {

				e.printStackTrace();
				
			}	
			
			
		}else {
			
			System.out.println("StudentDoa-- insertStudent() DB not connected!");
			
		}
		
		return affectedRows;
		
	}
	
	public void updateStudent() {

	}
	
	public void deleteStudent() {

	}
	
	public void getAllStudents() {

	}

	
	public static void main(String[] args) {
		
		StudentDoa studentDoa = new StudentDoa();
		
		int affectedRows = studentDoa.insertStudent();
		
		if(affectedRows > 0) {
			
			System.out.println("Values Inserted Successfully : " + affectedRows);
			
		}else {
			
			System.out.println("Values not Inserted Successfully : " + affectedRows);
			
		}
		
	}
	
}
