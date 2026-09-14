package collectionfrmk.listtopic;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		for (Integer integer : list) {
			
			System.out.println(integer);
			
		}
		
		list.set(6, 67);
		
		System.out.println("---------------------------------");
		
		for (Integer integer : list) {
			
			System.out.println(integer);
			
		}
		
		list.remove(4);
		
		System.out.println("---------------------------------");
		
		for (Integer integer : list) {
			
			System.out.println(integer);
			
		}
		
	}
	
}
