package stringtopic.methodes;

import java.util.Scanner;

public class PawsdStrengthChecker {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a Strong Password : ");
		String paswd = sc.nextLine();
		
		if(paswd.contains("@") && paswd.length() >= 8) {
			
			System.out.println("Strong Password!!");
			
		}else {
			
			System.out.println("Weak Password!!");
			
		}//end of if-else
		
	}
	
}
