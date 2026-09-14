package pragatimam.tasks;

import java.util.Scanner;

public class MovieBookingSystem {

	
	/*
	 	1. Movie Ticket Booking System 

		Question:

		Write a Java program to calculate movie ticket price for multiple customers.

		Input:

		Name Of Customers
		Number of customers
		Customer age
		Number of tickets

		Rules:

		Ticket price = ₹200

		Using nested if-else:

		If age < 12:
		50% discount
		Else:
		If age >= 60:
		30% discount
		Otherwise:
		No discount
	
		OUTPUT
		
		Customer 1
		Customer Name = Ronak
		Amount = 200
		Discount = 100
		Final = 100
		
		Customer 2
		Customer Name = Bijal
		Amount = 200
		Discount = 60
		Final = 140
	  
	  */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int numCust;
		int age;
		int numTict;
		int disc;
		int finalPrice;
		int orgPrice = 200;
		
		System.out.println("==================== MOVIE TICKETS BOOKING SYSTEM ====================");
		System.out.print("Enter the Number of Customers : ");
		numCust = sc.nextInt();
		
		for(int i = 1; i <= numCust; i++) {
			
			sc.nextLine();
			System.out.print("Enter the Name of the Customer : ");
			name = sc.nextLine();
			System.out.print("Enter the Age of the Customer : ");
			age = sc.nextInt();
			
			if(age < 12) {
				
				disc = orgPrice / 100 * 50;
				finalPrice = orgPrice - disc;
				
			}else if(age >= 60) {
				
				disc = orgPrice / 100 * 30;
				finalPrice = orgPrice - disc;
				
			}else {
				
				disc = 0;
				finalPrice = orgPrice - disc;
				
			}//end of if - else ladder
			
			System.out.println("==================== FINAL BILL ==================");
			System.out.println("Customer Id : " + i);
			System.out.println("Customer Name : " + name);
			System.out.println("Amount : " + orgPrice);
			System.out.println("Discount : " + disc);
			System.out.println("Final Price : " + finalPrice);
			
		}//end of for
		
	}
	
}
