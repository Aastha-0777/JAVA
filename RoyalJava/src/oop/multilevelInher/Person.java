package oop.multilevelInher;

import java.util.Scanner;

public class Person {
	
	String name;
	
	Scanner sc = new Scanner(System.in);
	
//	public Person() {
//		
//		System.out.println("Person : Default Const.");
//		
//	}//end of default constructor
//
//	public Person(String name) {
//		
//		this.name = name;
//		
//		System.out.println("Person : Para Const.");
//		
//	}//end of parameter constructor

	public void scanData() {
				
		System.out.print("Enter the Name : ");
		name = sc.nextLine();
		
	}//end of scanData
	
}
