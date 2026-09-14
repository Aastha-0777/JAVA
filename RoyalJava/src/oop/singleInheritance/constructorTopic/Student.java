package oop.singleInheritance.constructorTopic;


public class Student extends Person {
	
	private int rollNo, std, marks;
	
	

	public Student( int rollNo, String name, int std, int marks) {
		
		super(name);
		this.rollNo = rollNo;
		this.std = std;
		this.marks = marks;
	}//end of constructor

	public void dispData() {
		
		System.out.println(rollNo + " " + name + " " + std + " " + marks);
		 
	}//end of dispData
	
}
