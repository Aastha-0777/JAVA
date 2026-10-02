package practical.test;

import java.util.Scanner;

public class EmployeeManagement {

//	q1 Student Management System Using Java I/O
//	q2 Employee Management System
//	q3 Hospital Management System
//	q4  Bank Management System
//
//	from this give any 2 with 
//	add 
//	delete 
//	search
//	display 
//	exit
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choice;
		
		do {
			
			System.out.println("1. Add");
			System.out.println("2. delete");
			System.out.println("3. Search");
			System.out.println("4. display");
			System.out.println("5. Exit");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:

				
				break;

			default:
				break;
			}
			
		} while (choice != 5);
		
	}
	
}
