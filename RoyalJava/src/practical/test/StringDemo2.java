package practical.test;

import java.util.Scanner;

public class StringDemo2 {

	/*
		Compare Two Strings
		Task:
		Take two strings.
		Check if they are equal using equals().
		
		Check Starting Word
		Task:
		Check whether a string starts with "Java".
		
		Repeat Greeting
		Task:
		Take a greeting and repeat it N times.
	*/
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter String 1 : ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			
			System.out.println("Both Strings are Equal!!");
			
		}else {
			
			System.out.println("Both Strings ara NOT Equal!!");
			
		}//end of if - else
		
		System.out.print("Enter a String : ");
		String str3 = sc.nextLine();
		
		if(str3.startsWith("Java")) {
			
			System.out.println("The String Starts With Java.");
			
		}else {
			
			
			System.out.println("The String does NOT Starts With Java.");
			
		}//end of if - else
		
		System.out.print("Enter a Greating Message : ");
		String greeting = sc.nextLine();
		
		System.out.print("Enter the Number of times you want to repeat : ");
		int n = sc.nextInt();
		
		System.out.println(greeting.repeat(n));

 	}
	
}
