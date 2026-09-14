package oop.multilevelInher;

public class Student extends Person {
	
	int rollNo;
	int std;
	int marks;
	
//	public Student() {
//		
//		System.out.println("Student : Default Const.");
//		
//	}//end of default constructor
//
//	public Student(String name, int rollNo, int std, int marks) {
//		
//		super(name);
//		this.rollNo = rollNo;
//		this.std = std;
//		this.marks = marks;
//		
//		System.out.println("Student : Para Const.");
//		
//	}//end of Parameter constructor

	public void scanStdData() {
		
		scanData();
		System.out.print("Enter the Roll No. : ");
		rollNo = sc.nextInt();
		System.err.print("Enter the Std : ");
		std = sc.nextInt();
		System.out.print("Enter the Marks : ");
		marks = sc.nextInt();
		
	}//end of scanData
	
}
