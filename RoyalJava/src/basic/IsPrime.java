package basic;

import java.util.Scanner;

public class IsPrime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================= PRIME CHECKER =================");
		
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int fcCounter = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				fcCounter++;
				
			}//end of if
			
		}//end of for
		
		if(fcCounter == 2) {
			
			System.out.println(num + " is Prime.");
			
		}else {
			
			System.out.println(num + " is Not Prime.");
			
		}//end of if-else
		
	}

}
