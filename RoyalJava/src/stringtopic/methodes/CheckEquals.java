package stringtopic.methodes;

import java.util.Scanner;

public class CheckEquals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		if (str1.equalsIgnoreCase(str2)) {
			
			System.out.println("Both are Equal!!");
			
		} else {
			
			System.out.println("Both are Unequal!!");

		}
		
	}
	
}
