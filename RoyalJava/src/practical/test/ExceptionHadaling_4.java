package practical.test;

import java.util.Scanner;

public class ExceptionHadaling_4 {

	/*
	 * 
	 * 	1. Age Validation
	 *	2. Password Validation
	 *	3. ATM Withdrawal
	 *	4. Marks Validation
	 * 
	 * */
	
	public static void atmWthdrawal(float amount) throws CanNotWithdraw {
		
		float currentAmount = 67000f;
		
		if(amount < currentAmount  && currentAmount - amount >= 10000) {
			
			System.out.println("Amount Withdrawal Successfull!!");
			
		}else {
			
			throw new CanNotWithdraw("\n\"Can't Withdraw Money!!\n\tThere Must be at least 10000 in the Bank after Withdrawal!!\"");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount you want to Withdraw : ");
		float amt = sc.nextFloat();
		
		try {
			
			atmWthdrawal(amt);
			
		}catch (CanNotWithdraw c) {

			c.printStackTrace();

		}

		
	}
	
}
