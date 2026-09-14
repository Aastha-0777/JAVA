package practical.test;

import java.util.Scanner;

public class ExceptionHadaling_3 {

	/*
	 * 
	 * 	1. Age Validation
	 *	2. Password Validation
	 *	3. ATM Withdrawal
	 * 
	 * */
	
	public static void isValidPassword(String pwsd) throws InvalidPass {
		
		if(pwsd.length() >= 8 && pwsd.endsWith("@")) {
			
			System.out.println("Storng Password!!");
			
		}else {
			
			throw new InvalidPass("\nInvalid Password!!\n\tPlease Enter a Strong Password!!");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password for Verification : ");
		String pass = sc.nextLine();
		
		try {
			
			isValidPassword(pass);
			
		}catch (InvalidPass p) {

			p.printStackTrace();

		}

		
	}
	
}
