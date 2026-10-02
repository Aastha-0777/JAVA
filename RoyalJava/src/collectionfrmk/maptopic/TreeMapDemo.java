package collectionfrmk.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		//It will sort the values based on Key...
		TreeMap<Integer, String> hashMap = new TreeMap<Integer, String>();
		
		hashMap.put(29, "Greesha");//Entry = [Key, Value]
		hashMap.put(1, "Aastha");
		hashMap.put(45, "Riya");
		hashMap.put(44, "Yashvi");
		hashMap.put(137, "Sherya");
		hashMap.put(3, "Drashti");
		hashMap.put(133, "Sakshi");
		
		for(Map.Entry<Integer, String> e : hashMap.entrySet()) {
			
			int key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key + " : " + value);
			
		}
		
	}

}
