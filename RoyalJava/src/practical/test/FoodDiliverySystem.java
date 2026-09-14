package practical.test;

import java.util.Scanner;

public class FoodDiliverySystem {
	
	/*
	  To develop a Food Delivery System in Java using an abstract class to demonstrate the concepts of Abstraction,
	  Inheritance, Method Overriding, Upcasting, Downcasting, Runtime Polymorphism, and the instanceof operator by 
	  implementing different restaurant services such as PizzaHut and Dominos.
	 */
	
	public static void doSpecificTask(Restaurant r) {
		
		r.showOffers();
		
		if(r instanceof PizzaHut) {
			
			PizzaHut p = (PizzaHut)r;
			
			p.addExtracheese();
			
		}else if(r instanceof Dominos) {
			
			Dominos d = (Dominos)r;
			
			d.makeCheeseBrust();
			
		}
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		FoodDiliverySystem f = new FoodDiliverySystem();
		
		while(true) {
			
			System.out.println("------------------- Food Dilivery System -------------------");
			System.out.println("1. Pizza Hut");
			System.out.println("2. Dominos");
			System.out.println("3. Exit");
			System.out.print("Enter From the above choice : ");
			int choice = f.sc.nextInt();
			
			switch(choice) {
			
			case 1 : Restaurant r = new PizzaHut();
					 doSpecificTask(r);
					 break;
					 
			case 2 : Restaurant re = new Dominos();
					 doSpecificTask(re);
					 break;

			case 3 : System.exit(0);
			
			default : System.out.println("Invalid Choice!!");
					 
			}//end of switch
			
		}//end of while
		
	}
	

}
