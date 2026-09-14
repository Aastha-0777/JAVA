package iotopic.objecttype;

import java.io.Serializable;


public class Student implements Serializable{
	
	int rollNo;
	String name;
	int std;
	float marks;
	
	
	
	public Student(int rollNo, String name, int std, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	
}
