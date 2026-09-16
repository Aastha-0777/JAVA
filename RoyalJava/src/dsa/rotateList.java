package dsa;

import java.util.LinkedList;
import java.util.Scanner;

public class rotateList {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		System.out.println(list);
		
		System.out.print("Enter the Number of time you want to rotate : ");
		int k = sc.nextInt();
		
		for(int i = 0; i < k; i++) {
			
			list.addFirst(list.removeLast());
			
		}
		
		System.out.println("LinkList after Ronating " + k + " times : " + list);
		
	}
	
}
