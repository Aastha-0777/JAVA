package oop.singleInheritance;

import java.util.Scanner;

public class Student extends Person {
	
	private int rollNo, std, marks;
	
	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Roll No. : ");
		rollNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name : ");
		name = sc.nextLine();
		System.out.print("Enter the Std. : ");
		std = sc.nextInt();
		System.out.print("Enter the Marks : ");
		marks = sc.nextInt();
		
	}//end of scanData

	public void dispData() {
		
		System.out.println(rollNo + " " + name + " " + std + " " + marks);
		 
	}//end of dispData
	
}
