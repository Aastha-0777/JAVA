package collectionfrmk.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("aastha");
		list.add("greesha");
		list.add("riya");
		list.add("yashvi");
		list.add("drashti");
		list.add("shreya");
		list.add("sakshi");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			String name = itr.next();
			
			System.out.println(name);
			
		}
		
		
	}

}
