package oop.classobj;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
 	private int std;
	private int marks;
	
	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter RollNo : ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
		
	}//end of scanData
	
	public void disData() {
		
		System.out.println(roll + " " + name + " " + std + " " + marks + " ");
		
	}//end of disData
	
}
