package collectionfrmk.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// it will not maintain the insertion order
		// it will sort the value in ascending order
		// it will remove the second occurrence of the duplicate value
		TreeSet<String> set = new TreeSet<String>();

		set.add("Greesha");
		set.add("Aastha");
		set.add("Riya");
		set.add("Yashvi");
		set.add("Sherya");
		set.add("Drashti");
		set.add("Sakshi");
		set.add("Yashvi");
		set.add("Sherya");
		set.add("Drashti");
		set.add("Sakshi");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {

			String name = (String) itr.next();

			System.out.println(name);

		}

	}

}
