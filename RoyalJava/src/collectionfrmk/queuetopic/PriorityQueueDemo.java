package collectionfrmk.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Greesha");
		queue.add("Aastha");
		queue.add("Riya");
		queue.add("Yashvi");
		queue.add("Sherya");
		queue.add("Drashti");
		queue.add("Sakshi");
		
	
		//to get the natural order
		
		while(!queue.isEmpty()) {
			
			String name = queue.poll();
			
			System.out.println(name);
			
		}
		
		//using iterator
		
//		Iterator<String> itr = queue.iterator();
//		
//		while (itr.hasNext()) {
//			
//			String name = itr.next();
//			
//			System.out.println(name);
//			
//		}
//		
		
	}
	
}
