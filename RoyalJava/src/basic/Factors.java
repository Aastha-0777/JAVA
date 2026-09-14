package basic;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================= FACTORS PRINTER =================");
		
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				System.out.println("Factor : " + i);
				
			}//end of if
			
		}//end of for
		
	}
	
}
