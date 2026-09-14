package pragatimam.tasks;

import java.util.Scanner;

public class LockNumber {

	public static void main(String[] args) {
		
			/*1.
			Create a Java program that accepts a number from the user and checks whether it can unlock the secret lock.

			Conditions:

			The number must be a 3-digit number.
			All three digits must be different.
			The sum of the digits must be an even number.

			Output:

			Print "Lock Open" if all conditions are satisfied.
			Otherwise, print "Lock Closed".
			 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================== WELCOME TO SECRET LOOK GAME ==================");
		System.out.println("->You Only Have 3 Chance to Unlock the Secret Lock.");
		
		int life = 3;
		
		do {
			
			int pws;
			
			System.out.print("Enter the Numeric Password : ");
			pws = sc.nextInt();
			
			int digitCounter = 0;
			int tempPws = pws;
			int digit1, digit2, digit3;
			int sum = 0;
			int flag = 0;
			while(tempPws != 0) {
				
				digit1 = tempPws % 10;
				digitCounter++;
				sum += digit1;
				digit2 = tempPws % 10;
				digitCounter++;
				sum += digit2;
				digit3 = tempPws % 10;
				digitCounter++;
				sum += digit3;
				System.out.println(digitCounter);
				
				if(digit1 != digit2 && digit1 != digit3) {
					
					if(digit2 != digit3 && sum % 2 == 0) {
						
						flag = 1;
						
					}
					
				};
				
			}//end of while
			
			if(digitCounter == 3 && flag == 1) {
				
				System.out.println("->Congrets!!You Have Successfully!");
				
			} else {
				
				System.out.println("->Invalid Password!! Please Try Again");
				life--;
				
			}//end of if - else	 
			
			
		}while(life != 0);
		
		if(life == 0) {
			
			System.out.println("You Have Lost the Game.");
			
		}//end of if
	}
	
}
