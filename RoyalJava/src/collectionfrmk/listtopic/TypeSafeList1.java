package collectionfrmk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeSafeList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Aastha");
		list.add("Radha");
		list.add("Krishna");
		list.add("Vasudev");
		list.add("Laxmi");
		
		System.out.println("list.size() : " + list.size());
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			String value = itr.next();
			System.out.println(value);
			
		}
		
	}
	
}
