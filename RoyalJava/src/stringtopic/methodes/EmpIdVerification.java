package stringtopic.methodes;

import java.util.Scanner;

public class EmpIdVerification {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter the EMP Id : format(EMPxxxx) ");
		String empId = sc.nextLine();
		
		if(empId.startsWith("EMP")) {
			
			System.out.println(empId + " Employee Id is Verified!"); 
			
		}else {
			
			System.out.println(empId + " Employee Id is NOT Verified!");
			
		}
		
	}
	
}
