package practical.test;

import java.util.Scanner;

public class Test2 {

	//1. Reverse a String
	//Input a string.
	//Print the reverse without using StringBuilder.reverse().
//	
	public static void main(String[] args) {
//		
		Scanner sc = new Scanner(System.in);
//		
//		String strRev = "";
//		
//		System.out.println("Enter a String : ");
//		String strOrg = sc.nextLine();
//		
//		for(int i = strOrg.length() - 1; i >= 0 ; i--) {
//			
//			strRev +=  strOrg.charAt(i);
//			
//		}//end of for
//		
//		System.out.println("The Reverse of the Org String is : " + strRev);
//		
//		
	
		//
		//2. Count Vowels
		//Input a string.
		//Count vowels (A, E, I, O, U).
		//
	
//		int vowelCounter = 0;
//		System.out.println("Enter a String : ");
//		String str1 = sc.nextLine();
//		
//		str1 = str1.toUpperCase();
//		
//		for(int i = 0; i < str1.length(); i++) {
//			
//			if(str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U') {
//				
//				vowelCounter++;
//				
//			}
//			
//		}
//		
//		System.out.println("Number of Vowels in The String are : " + vowelCounter);

		
		//3. Count Uppercase and Lowercase Letters
		//Input a string.
		//Display the number of uppercase and lowercase letters.
		//
		
//		int lowerCaseCounter = 0;
//		int upperCaseCounter = 0;
//		
//		System.out.println("Enter a String : ");
//		String str1 = sc.nextLine();
//		
//		for(int i = 0; i < str1.length(); i++) {
//			
//			char x = str1.charAt(i);
//			
//			if(x >= 97 && x <= 122) {
//				
//				upperCaseCounter++;
//				
//			}else {
//				
//				lowerCaseCounter++;
//				
//			}
//			
//		}
//		
//		System.out.println("Number of Upper Case letters in the String : " + upperCaseCounter);
//		System.out.println("Number of Lower Case letters in the String : " + lowerCaseCounter);
//		
		//4. Count Words
		//Input a sentence.
		//Count the total number of words.
		//
		
		int wordCounter = 0;
		
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();
		str1 = str1.toUpperCase();
		
//		for(int i = 0; i < str1.length(); i++) {
//			
//			if(str1.) {
//				
//				wordCounter++;
//				
//			}
//			
//		}
//		
//		System.out.println("The Number of Words in the String are : " + wordCounter);
//		
		
	}
	
}






//5. Find Frequency of a Character
//Input a string.
//Input a character.
//Count how many times that character appears.
//
//6. Password Validator
//
//Check whether the password:
//
//Has at least 8 characters
//Contains one uppercase letter
//Contains one lowercase letter
//Contains one digit
//Contains one special character
//
//If all conditions are satisfied, print:
//Strong Password
//
//Otherwise:Weak Password
