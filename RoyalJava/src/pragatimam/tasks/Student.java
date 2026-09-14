package pragatimam.tasks;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	void getDetails() {
		
		System.out.print("Enter the Name of Student : ");
		String sname = sc.nextLine();
		setName(sname);
		System.out.print("Enter the Course of Student : ");
		String scourse = sc.nextLine();
		setCourse(scourse);
	}
	

}
