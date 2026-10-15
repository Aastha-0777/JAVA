package dsa;

import java.util.Scanner;

public class AddDigits {

	static Scanner sc = new Scanner(System.in);

	public static int addDigits(int num) {

		int sum = 0;

		while (num != 0) {

			sum += num % 10;
			num /= 10;

		}

		if (sum >= 10) {

			sum = addDigits(sum);

		} // end of if

		return sum;

	}

	/*
	 * O(1) approach : 
	 * 
	 * int addDigits(int num)
	 * { if (num == 0) return 0; 
	 * if (num % 9 == 0) return 9;
	 * return num % 9; 
	 * }
	 */

	public static void main(String[] args) {

		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int res = addDigits(num);

		System.out.println("Res : " + res);

	}

}
