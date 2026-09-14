package collectionfrmk.listtopic;

import java.util.ArrayList;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> mainList = new ArrayList<Integer>();
		ArrayList<Integer> subList = new ArrayList<Integer>();
		
		mainList.add(10);
		mainList.add(20);
		mainList.add(30);
		mainList.add(40);
		mainList.add(1, 50);

		System.out.println("mainList.get(0) : " + mainList.get(0));
		
		for(Integer value : mainList) {
			
			System.out.println(value);
			
		}
		
		subList.add(60);
		subList.add(70);
		subList.add(80);
		
		mainList.addAll(4, subList);
		
		System.out.println("-------------------------------------");
		
		for(Integer value : mainList) {
			
			System.out.println(value);
			
		}
		
	}
	
}
