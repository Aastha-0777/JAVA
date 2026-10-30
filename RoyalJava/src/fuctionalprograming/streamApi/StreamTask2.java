package fuctionalprograming.streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamTask2 {
												
	public static void main(String[] args) {

		/*
		 * Assignment 1: String Filtering and Sorting Problem Statement : Given a list
		 * of names, write a Java program using Streams to: -Filter names that start
		 * with the letter 'a' or 'A' (case-insensitive). -Convert all matching names to
		 * UPPERCASE. -Sort the names in alphabetical order and collect them into a
		 * list.
		 */
		
		List<String> listName = new ArrayList<String>(List.of("Ava", "Lisbon", "Jane", "Aastha", "Sakshi")); 

		List<String> list = listName.stream().filter(name -> name.startsWith("a") || name.startsWith("A"))
				.map(name -> name.toUpperCase()).sorted().toList();
		
		System.out.println(list);

		/*
		 * Assignment 2: Working with Custom Objects Problem Statement : Create a
		 * Product class with name (String) and price (double). Given a list of
		 * products: -Filter products that have a price greater than $500. -Sort them by
		 * price in descending order (highest price first). -Extract only the names of
		 * those products and collect them into a List<String>.
		 */

		
		Product p1 = new Product("Laptop", 1000);
		Product p2 = new Product("Watch", 200);
		Product p3 = new Product("Iphone", 2500);
		Product p4 = new Product("Tablet", 499);
	
		List<Product> productList = new ArrayList<Product>(List.of(p1, p2, p3, p4));
		
		List<String> list2 = productList.stream().filter(product -> product.getPrice() > 500)
				   .sorted(new SortByPrice()).map(product -> product.getName()).toList();

		System.out.println(productList);
		System.out.println(list2);
		
//		var nums = new int[] {0};
		
	}

}
