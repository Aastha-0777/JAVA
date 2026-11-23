package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDoaPrep {

	static Scanner sc = new Scanner(System.in);
	
	public int insertStudent(StudentBean sBean) {

		int affectedRows = 0;
		String insertQuery = "INSERT INTO student(name, std, marks) VALUES(?,?,?)";
		
		System.out.println("insertQuery : " + insertQuery);
		
		//1. get Connection
		Connection conn = DBConnection.getConnectionM();
		PreparedStatement prepStmt = null;
		
		//2. Validate Connection
		if(conn != null) {
			
			try {
				
				//3. Create statement obj
				prepStmt = conn.prepareStatement(insertQuery);
				prepStmt.setString(1, sBean.getName());
				prepStmt.setInt(2, sBean.getStd());
				prepStmt.setInt(3, sBean.getMarks());
				
				//4. execute query
				affectedRows = prepStmt.executeUpdate();
				
			} catch (Exception e) {

				e.printStackTrace();
				
			}	
			
			
		}else {
			
			System.out.println("StudentDoa-- insertStudent() DB not connected!");
			
		}
		
		return affectedRows;
		
	}
	
	public int updateStudent(StudentBean sbean, int rNO) {

		String updateQuery = "UPDATE student SET name = ?, std = ?, marks = ? WHERE rno = ?";
		System.out.println(updateQuery);
		Connection conn = DBConnection.getConnectionM();
		PreparedStatement prepStmt = null;
		int rowAffected = 0;
		
		if(conn != null) {
			
			try {
				
				prepStmt = conn.prepareStatement(updateQuery);
				prepStmt.setString(1, sbean.getName());
				prepStmt.setInt(2, sbean.getStd());
				prepStmt.setInt(3, sbean.getMarks());
				prepStmt.setInt(4, rNO);
				System.out.println(updateQuery);
				rowAffected = prepStmt.executeUpdate();
				
			} catch (SQLException s) {
		
				s.printStackTrace();
				
			}
			
		}else {
			
			System.out.println("DB Not Connected!!");
		}
		
		return rowAffected;
	
		
	}
	
	public int deleteStudent(int rNo) {

		String deleteQurey = "DELETE FROM student WHERE rno = ?";
		
		Connection conn = DBConnection.getConnectionM();
		PreparedStatement prepStmt = null;
		int rowAffected = 0;
		
		if(conn != null) {
			
			try {
				
				prepStmt = conn.prepareStatement(deleteQurey);
				prepStmt.setInt(1, rNo);
				rowAffected = prepStmt.executeUpdate();
				
			} catch (SQLException s) {
		
				s.printStackTrace();
				
			}
			
		}else {
			
			System.out.println("DB Not Connected!!");
		}
		
		return rowAffected;
		
	}
	
	public List<StudentBean> getAllStudents() {

		String selectQuery = "select * from student";
		
		Connection conn = DBConnection.getConnectionM();
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		
		List<StudentBean> list = new ArrayList<StudentBean>();
		StudentBean sBean; 
		
		if(conn != null) {
			
			try {
				
				prepStmt = conn.prepareStatement(selectQuery);
				rs = prepStmt.executeQuery();	
		
				while(rs.next()) {
					
					int rollNo = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks =  rs.getInt(4);
					
//					System.out.println(rollNo + " " + name + " " + std + " " + marks);
					
					sBean = new StudentBean(rollNo, name, std, marks);
					
					list.add(sBean);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else {
			
			System.out.println("DB Not connected : " + conn);
			
		}
		
		return list;
		
	}

	public StudentBean getStudentByName(String name) {
		
		String selectQuery = "SELECT * FROM student WHERE name LIKE ?";
		Connection conn = DBConnection.getConnectionM();
		PreparedStatement prepStmt = null;
		StudentBean sBean = null;
		ResultSet rs = null;
		if(conn != null) {
			
			try {
				prepStmt = conn.prepareStatement(selectQuery);
				
				prepStmt.setString(1, name);
				
				rs = prepStmt.executeQuery();
				
				if(rs.next()) {
					
					int rollNo = rs.getInt(1);
					int std = rs.getInt(3);
					int marks =  rs.getInt(4);
					sBean = new StudentBean(rollNo, name, std, marks);
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}else {
			
			System.out.println("DB Not Connected!");
			
		}
		
		return sBean;
		
	}
	
	public static void main(String[] args) {
		
		StudentDoaPrep studentDoa = new StudentDoaPrep();
		
		List<StudentBean> allStudents = studentDoa.getAllStudents();
		
		for (StudentBean student : allStudents) {
			
			System.out.println(student.getRno() + " " + student.getName() + " " + student.getStd() + " " + student.getMarks());
			
		}
	
		StudentBean sBean = studentDoa.getStudentByName("Aastha Lakhatariya");
		
		if(sBean != null) {
			
			System.out.println(sBean.getRno() + " " + sBean.getName() + " " + sBean.getStd() + " " + sBean.getMarks());
			
		}else {
			
			System.out.println("Name Not Found.");
			
		}
//		
//		System.out.print("Enter the Student's Name : ");
//		String name = sc.nextLine();
//		System.out.print("Enter the Student's Std : ");
//		int std = sc.nextInt();
//		System.out.print("Enter the Student's Marks : ");
//		int marks = sc.nextInt();
//		
//		StudentBean sBean = new StudentBean(name, std, marks);
//		
//		int affectedRows = studentDoa.insertStudent(sBean);
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
	
	
//		System.out.print("Enter the Roll No. of the Student You Want to Update : ");
//		int rNo = sc.nextInt();
//		sc.nextLine();
//		System.out.print("Enter the Student's Name : ");
//		String name = sc.nextLine();
//		System.out.print("Enter the Student's Std : ");
//		int std = sc.nextInt();
//		System.out.print("Enter the Student's Marks : ");
//		int marks = sc.nextInt();
//		
//		StudentBean sBean = new StudentBean(name, std, marks);	
//		
//		int affectedRows = studentDoa.updateStudent(sBean, rNo);
//		
//		if(affectedRows > 0) {
//			
//			System.out.println("Values Updated Successfully : " + affectedRows);
//			
//		}else {
//			
//			System.out.println("Values not Updated Successfully : " + affectedRows);
//			
//		}
//	
//		
	}
	
}
