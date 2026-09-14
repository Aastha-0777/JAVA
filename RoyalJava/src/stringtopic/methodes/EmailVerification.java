package stringtopic.methodes;

import java.util.Scanner;

public class EmailVerification {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter an Email : ");
		String email = sc.nextLine();
		
		if(email.contains("@") && email.contains("gmail") && email.endsWith(".com")) {
			
			System.out.println(email + " is Verified!");
			
		}else {
			
			System.out.println(email + " is NOT Verified!");
			
		}//end of if-else
		
	}
	
}
