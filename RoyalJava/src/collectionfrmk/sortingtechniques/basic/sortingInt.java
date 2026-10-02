package collectionfrmk.sortingtechniques.basic;

import java.util.ArrayList;
import java.util.Collections;

public class sortingInt {

	//list does not provide any class that sort the data like other data structure so use sorting techniques
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		list.add(20);
		list.add(67);
		list.add(234);
		list.add(98);
		list.add(10);
		list.add(7);
		
		System.out.println("List Before Sorting : " + list);
		
		Collections.sort(list);
		
		System.out.println("List After Sorting : " + list);
		
		
	}
	
}
