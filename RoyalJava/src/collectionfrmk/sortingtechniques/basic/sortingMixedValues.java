package collectionfrmk.sortingtechniques.basic;

import java.util.ArrayList;
import java.util.Collections;

public class sortingMixedValues {

	//list does not provide any class that 
	//sort the data like other data structure so use sorting techniques
	//the list to be sorted must be type safe else it will give java.lang.ClassCastException exception
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
	
		list.add(20);
		list.add(67.678);
		list.add(234.89f);
		list.add('r');
		list.add("royal");
		list.add(true);
		
		System.out.println("List Before Sorting : " + list);
		
		Collections.sort(list);
		
		System.out.println("List After Sorting : " + list);
		
		
	}
	
}
