package array;

import java.util.Scanner;

public class PrintPalindromeInArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int rev = 0;
		int digit = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("Enter a[" + i + "] : ");
			a[i] = sc.nextInt();
			
		}//end of for
		
		for(int i = 0; i < a.length; i++) {
			
			int num = a[i];
			rev = 0;
			digit = 0;
			int temp = num;
			
			while(num != 0) {
				
				digit = num % 10;
				rev = (rev * 10) + digit;
				num = num / 10;
	
			}//end of while
	
			if(temp == rev) {
				
				System.out.println("Palindrome : " + temp);
				
			}//end of if
			
		}//end of for
		
	}

}
