package dsa;

import java.util.LinkedList;

public class RemoveDuplicatesFromLL {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(40);

		System.out.println("List : " + list);

		removeDuplicates(list);

		System.out.println("List After Removing Duplicates : " + list);

	}

	private static void removeDuplicates(LinkedList<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {

		

		} // end of outer for
	}

}
