package exception.handaling;

import java.util.Scanner;

public class ageVerificationUDException {

	public static void isValidForVote(int age) throws InvalideAge { // throws is optional in UnChecked Exception

		if(age < 18) {
			
			//1.Checked Exception
			throw new InvalideAge("\n\"Invalid Age, \n\tPlease Enter a Valid age for Vote\".");
			
		}else {
			
			System.out.println("Welcome for Vote.");
			
		}

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age for Verification : ");
		int age = sc.nextInt();
		
		try {
		
			isValidForVote(age);
		
		} catch (InvalideAge e) {
				
			e.printStackTrace();
		
		}
		
		System.out.println("General Statements.");
		
	}
	
}
