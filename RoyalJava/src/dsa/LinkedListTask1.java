package dsa;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTask1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> revList = new LinkedList<Integer>();
		
		System.out.println("Enter 7 Number into List :- ");

		for (int i = 0; i < 7; i++) {

			System.out.print("Enter the Number : ");
			int num = sc.nextInt();

			list.add(num);

		}

		// --------------------------------------------------

		System.out.println("--------------------------------------------------");

		int max = list.get(0);

		for (Integer value : list) {

			if (value > max) {

				max = value;

			}

		}

		System.out.println("Maximum Element in the List is : " + max);

		// --------------------------------------------------

		System.out.println("--------------------------------------------------");

		int sum = 0;

		for (Integer value : list) {

			sum += value;

		}

		System.out.println("Sum of all Elements in the List is : " + sum);

		// --------------------------------------------------

		System.out.println("--------------------------------------------------");

		for (Integer value : list) {
		
			revList.addFirst(value);
			
		}

		if(list.equals(revList)) {
			
			System.out.println("The Lists are Pallindrome!!");
			
		}else {
			
			System.out.println("The Lists are NOT Pallindrome!!");
			
		}
		
		//System.out.println("list == revList : " + (list.equals(revList)));
		
	}

}
