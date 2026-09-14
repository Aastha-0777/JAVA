package oop.herhInheritance;

import java.util.Scanner;

public class NonTechEmployee extends Employee{

	String projName;
	
	Scanner sc = new Scanner(System.in);
	
	public void scanData() {
		
		System.out.print("Enter the Id : ");
		id = sc.nextInt();
		System.out.print("Enter the Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name : ");
		name = sc.nextLine();
		System.out.print("Enter the Dsgn : ");
		dsgn = sc.nextLine();
		System.out.print("Enter the Project Name : ");
		projName = sc.nextLine();
		
	}//end of scanData
	
	public void disData() {
		
		System.out.println(id + " " + salary + " " + name + " " + dsgn + " " + projName);
		
	}//end of disData
	
}
