package collectionfrmk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeArrList {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList empList = new ArrayList();

		System.out.print("Enter the Number of Employee you want to add : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			System.out.print("Enter Employee Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Employee Name : ");
			String name = sc.nextLine();
			System.out.print("Enter the Employee Orgn : ");
			String empOrgn = sc.nextLine();
			System.out.print("Enter the Employee Occu : ");
			String occu = sc.nextLine();
			System.out.print("Enter the Employee Salary : ");
			float sly = sc.nextFloat();
			
			Employee e = new Employee(id, empOrgn, occu, sly, name);
			
			empList.add(e);
			
		}//end of for
		
		System.out.println();
		
		for(int i = 0; i < empList.size(); i++) {

			Object obj = empList.get(i);

			if(obj instanceof Employee) {
				
				Employee e = (Employee)obj;
				
				System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getOccupation() + " " + e.getOrgn() + " " + e.getSallary());
				
			}//end of if
			
		}//end of display for
		
	}

}
