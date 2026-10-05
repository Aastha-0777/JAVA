package collectionfrmk.sortingtechniques.cmprble;

import java.util.ArrayList;
import java.util.Collections;

public class SortProductOnPrice {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Laptop", 90000, "Dell XPS");
		Product p2 = new Product(2, "Phone", 200000, "iPhone");
		Product p3 = new Product(3, "Camera", 150000, "Sony");

		ArrayList<Product> proList = new ArrayList<Product>();

		proList.add(p1);
		proList.add(p2);
		proList.add(p3);

		System.out.println("Product Before Sorting : ");

		for (Product product : proList) {

			System.out.println(
					product.getpId() + " " + product.getpName() + " " + product.getpPrice() + " " + product.getpDisc());

		}

		Collections.sort(proList);

		System.out.println("Product After Sorting : ");
		for (Product product : proList) {

			System.out.println(
					product.getpId() + " " + product.getpName() + " " + product.getpPrice() + " " + product.getpDisc());

		}
		
	}

}
