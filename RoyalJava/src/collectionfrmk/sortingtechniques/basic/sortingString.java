package collectionfrmk.sortingtechniques.basic;

import java.util.ArrayList;
import java.util.Collections;

public class sortingString {

	//list does not provide any class that sort the data like other data structure so use sorting techniques
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Greesha");
		list.add("Aastha");
		list.add("Riya");
		list.add("Yashvi");
		list.add("Sherya");
		list.add("Sakshi");
		
		System.out.println("List Before Sorting : " + list);
		
		Collections.sort(list);
		
		System.out.println("List After Sorting : " + list);
		
		
	}
	
}
