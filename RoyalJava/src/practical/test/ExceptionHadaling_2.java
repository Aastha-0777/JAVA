package practical.test;

import java.util.Scanner;

public class ExceptionHadaling_2 {

	/*
	 * 
	 * 	1. Age Validation
	 *	2. Password Validation
	 *	3. ATM Withdrawal
	 * 
	 * */
	
	public static void isValidAge(int age) throws InvalidAge {
		
		if(age >= 18) {
			
			System.out.println("Wellcome to Vote!!");
			
		}else {
			
			throw new InvalidAge("\nInvalid Age!!\n\tPlease Enter a Valid Age!!");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age for Verification : ");
		int age = sc.nextInt();
		
		try {
			
			isValidAge(age);
			
		}catch (InvalidAge a) {

			a.printStackTrace();

		}

		
	}
	
}
