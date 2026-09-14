package pragatimam.tasks;

import java.util.Scanner;

public class MobileRechargeSystem {

	
	/*
	  	2. Mobile Recharge System 

		Question:

		Write a Java program to check recharge offers for multiple users.

		Input:

		Number of users
		Recharge amount
		User type (1 = Normal, 2 = Premium)

		Rules:

		If recharge amount ≥ 500:
		If user type is Premium:
		Get 20% extra data
		Else:
		Get 10% extra data
		Otherwise:
		No extra data

		Output:
		Display:

		User number
		Recharge amount
		Offer status
		
		*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		float amount;
		int type;
		
		System.out.println("==================== MOBILE RECHARGE SYSTEM ====================");
		System.out.print("Enter the Number of Users : ");
		number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			
			System.out.print("Enter the Recharge Amount : ");
			amount = sc.nextFloat();
			
			if(amount >= 500) {
				
				System.out.println("Enter 1 for Premium.");
				System.out.println("Enter 2 for Normal.");
				System.out.print("Enter Your Type : ");
				type = sc.nextInt();
				
				switch(type) {
				
				case 1 : {
					
					System.out.println("User Number : " + i);
					System.out.println("Recharge Amount : " + amount);
					System.out.println("Offer Status : Congo! You hav e got 20% Extra Data.");
					
				} break;
				
				case 2 : {
					
					System.out.println("User Number : " + i);
					System.out.println("Recharge Amount : " + amount);
					System.out.println("Offer Status : Congo! You hav e got 10% Extra Data.");
					
				} break;
				
				default : System.out.println("Invalid Choice!!");
				
				}//end of switch
				
			}else {
				
				System.out.println("User Number : " + i);
				System.out.println("Recharge Amount : " + amount);
				System.out.println("Offer Status : Offer is only applicable for Recharge Amount Greater than or Equal to 500.");
				
			}//end of if - else
			
		}//end of for
		
	}
	
}
