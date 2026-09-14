package stringtopic.methodes;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindromeStr(String string) {
		
		for(int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
			
			if(string.charAt(i) != string.charAt(j)) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String string = sc.nextLine();
		
		
		if (isPalindromeStr(string)) {
			
			System.out.println(string + " is Pallindrome.");
			
		}else {
			
			System.out.println(string + " is Not Pallindrome.");
			
		}
		
	}
	
}
