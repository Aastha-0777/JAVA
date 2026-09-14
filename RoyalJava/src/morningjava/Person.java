package morningjava;

import java.util.Scanner;

public class Person {
	
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private int phNo;
	
	public void getData() {
		
		System.out.print("Enter the Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter the Phone Number : ");
		phNo = sc.nextInt();
		
	}

}
