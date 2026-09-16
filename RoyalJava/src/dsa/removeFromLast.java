package dsa;

import java.util.LinkedList;
import java.util.Scanner;

public class removeFromLast {
	
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
	
		System.out.println(list);

		System.out.print("Enter the Postion from where you want to delete : ");
		int position = sc.nextInt();
		
		int idxFromLast = list.size() - position;
		
		list.remove(idxFromLast);
		
		System.out.println("After Removing : ");
		System.out.print(list);

	}

}
