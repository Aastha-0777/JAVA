package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDoa {

	static Scanner sc = new Scanner(System.in);
	
	public int insertStudent(StudentBean sBean) {

		int affectedRows = 0;
		String insertQuery = "INSERT INTO student(name, std, marks) VALUES('"+sBean.getName()+"', "+sBean.getStd()+", "+sBean.getMarks()+")";
		Statement stmt = null;
		
		System.out.println("insertQuery : " + insertQuery);
		
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
	
	public int updateStudent(StudentBean sbean, int rNO) {

		String updateQuery = "UPDATE student SET name = '" + sbean.getName() + "', std = '" + sbean.getStd() + "', marks = " + sbean.getMarks() + " WHERE rno = " + rNO;
		System.out.println(updateQuery);
		Connection conn = DBConnection.getConnectionM();
		Statement stmt = null;
		int rowAffected = 0;
		
		if(conn != null) {
			
			try {
				
				stmt = conn.createStatement();
				rowAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException s) {
		
				s.printStackTrace();
				
			}
			
		}else {
			
			System.out.println("DB Not Connected!!");
		}
		
		return rowAffected;
	
		
	}
	
	public int deleteStudent(int rNo) {

		String deleteQurey = "DELETE FROM student WHERE rno = " + rNo;
		
		Connection conn = DBConnection.getConnectionM();
		Statement stmt = null;
		int rowAffected = 0;
		
		if(conn != null) {
			
			try {
				
				stmt = conn.createStatement();
				rowAffected = stmt.executeUpdate(deleteQurey);
				
			} catch (SQLException s) {
		
				s.printStackTrace();
				
			}
			
		}else {
			
			System.out.println("DB Not Connected!!");
		}
		
		return rowAffected;
		
	}
	
	public void getAllStudents() {

	}

	
	public static void main(String[] args) {
		
		StudentDoa studentDoa = new StudentDoa();
		
//		System.out.print("Enter the Student's Name : ");
//		String name = sc.nextLine();
//		System.out.print("Enter the Student's Std : ");
//		int std = sc.nextInt();
//		System.out.print("Enter the Student's Marks : ");
//		int marks = sc.nextInt();
//		
//		StudentBean sBean = new StudentBean(name, std, marks);
//		
////		int affectedRows = studentDoa.insertStudent(sBean);
//		
//		if(affectedRows > 0) {
//			
//			System.out.println("Values Inserted Successfully : " + affectedRows);
//			
//		}else {
//			
//			System.out.println("Values not Inserted Successfully : " + affectedRows);
//			
//		}

//		System.out.print("Enter the Roll No. of the Student You Want to Delete : ");
//		int rNo = sc.nextInt();
//		
//		int affectedRows = studentDoa.deleteStudent(rNo);
//		
//		if(affectedRows > 0) {
//			
//			System.out.println("Values Deleted Successfully : " + affectedRows);
//			
//		}else {
//			
//			System.out.println("Values not Deleted Successfully : " + affectedRows);
//			
//		}
//	
	
		System.out.print("Enter the Roll No. of the Student You Want to Update : ");
		int rNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Student's Name : ");
		String name = sc.nextLine();
		System.out.print("Enter the Student's Std : ");
		int std = sc.nextInt();
		System.out.print("Enter the Student's Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sBean = new StudentBean(name, std, marks);	
		
		int affectedRows = studentDoa.updateStudent(sBean, rNo);
		
		if(affectedRows > 0) {
			
			System.out.println("Values Deleted Successfully : " + affectedRows);
			
		}else {
			
			System.out.println("Values not Deleted Successfully : " + affectedRows);
			
		}
	
		
	}
	
}
