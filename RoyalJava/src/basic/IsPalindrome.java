package basic; 

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================== PALINDROME CHECKER ==================");
		
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		int digit = 0;
		
		while(num != 0) {
			
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}//end of while
		
		System.out.println(rev);
		
		if(temp == rev) {

			System.out.println(temp + " is Palindrome.");
	
		}else {
	
		System.out.println(temp + " is Not Palindrome.");
	
		}//end of if - else
		
	}
	
}
