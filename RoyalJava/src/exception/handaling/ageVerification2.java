package exception.handaling;

import java.util.Scanner;

public class ageVerification2 {

	public static void isValidForVote(int age) throws ArithmeticException {

		if(age < 18) {
			
			//1.Checked Exception
			throw new ArithmeticException("\nInvalid Age, \n\tPlease Enter a Valid age for Vote.");
			
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
		
		} catch (ArithmeticException e) {

			e.printStackTrace();
		
		}
		
		System.out.println("General Statements.");
		
	}
	
}
