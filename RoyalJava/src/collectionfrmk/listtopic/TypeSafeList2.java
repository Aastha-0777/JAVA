package collectionfrmk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeSafeList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("list.size() : " + list.size());
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			Integer value = itr.next();
			System.out.println(value);
			
		}
		
	}
	
}
