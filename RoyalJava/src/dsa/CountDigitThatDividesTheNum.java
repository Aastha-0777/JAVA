package dsa;

import java.util.Scanner;

public class CountDigitThatDividesTheNum {

	static Scanner sc = new Scanner(System.in);

	public static int countDigits(int num) {

		int digitCounter = 0;
		int orgNum = num;
		
		while(num != 0) {
			
			if(orgNum % (num % 10) == 0) {
				
				digitCounter++;
				
			}
			
			num /= 10;
			
		}//end of while
		
		return digitCounter;
		
	}

	public static void main(String[] args) {

		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int res = countDigits(num);

		System.out.println("Res : " + res);

	}

}
