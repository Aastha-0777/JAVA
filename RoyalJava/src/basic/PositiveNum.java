package basic;

import java.util.Scanner;

public class PositiveNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			
			System.out.println(num + " is Positive.");
			
		}
		
	}
	
}
