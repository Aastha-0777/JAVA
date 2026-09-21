package dsa;

import java.util.LinkedList;

public class SortLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(50);
		list.add(62);
		list.add(20);
		list.add(19);
		list.add(4);
		
		System.out.println("List : " + list);
		
		sortLinkedList(list);
		
		System.out.println("List After Sorting : " + list);
		
	}

	public static void sortLinkedList(LinkedList<Integer> list) {

		for(int i = 0; i < list.size() - 1; i++) {
			
			for(int j = 0; j < list.size() - 1 - i; j++) {
				
				if(list.get(j) > list.get(j + 1)) {
					
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					
				}
				
			}//end of inner for
			
		}//end of outer for
		
		

	}

}
