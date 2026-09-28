package collectionfrmk.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(12);
		vector.add(23);
		vector.add(45);
		vector.add(72);
		vector.add(89);
		vector.add(67);

		Iterator<Integer> itr = vector.iterator();
		
		while(itr.hasNext()) {
			
			Integer value = (Integer)itr.next();
			System.out.println(value);
			
		}
		
	}

}
