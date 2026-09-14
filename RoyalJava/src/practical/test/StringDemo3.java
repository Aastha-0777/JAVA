package practical.test;

import java.util.Scanner;

public class StringDemo3 {

	/*
		Trim Spaces
		Task:
		Remove leading and trailing spaces.
		
		Count Characters
		Task:
		Print the total number of characters in a string (including spaces).
		
		Extract Middle Character
		Task:
		Print the middle character of a string.
		
		Username Generator
		Task:
		Take first name and birth year.
		Concatenate them.	
	*/
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a City Name : ");
		String city = sc.nextLine();
		
		System.out.println("City(org) : " + city);
		System.out.println("City(lowecase) : " + city.toLowerCase());
		
		System.out.print("Enter a String with Spaces : ");
		String str1 = sc.nextLine();
		
		System.out.println("String(org) : " + str1);
		System.out.println("String(without spaces) : " + str1.strip());
		
		System.out.print("Enter a Full Name : ");
		String fullName = sc.nextLine();
		
		System.out.println("Full Name : " + fullName);
		System.out.println("First Name : " + fullName.substring(0, fullName.indexOf(" ")));
		
 	}
	
}
