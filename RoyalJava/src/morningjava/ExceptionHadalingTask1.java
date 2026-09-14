//package morningjava;
//
//import java.util.Scanner;
//
//public class ExceptionHadalingTask1 {

	/*
	 * 
	 * Create a Java program to collect data for a Girnar Yatra from students. The program should accept the following details:
	   Student's name
	   Branch
	   Number of people accompanying the student

       Exceptions:
	   If the number of people is more than 4, throw a custom exception.
       If the number of people is 0, throw a custom exception.
	   If the user enters a non-numeric value instead of a number, throw a custom exception.

 	   If the input is valid then display the entered details.
	 * 
	 * */
	
//	static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		
//	
//		String name;
//		String branch;
//		int noOfPeople;
//	
//		try {
//			
//			System.out.println("------------------- GIRNAR YATRA FROM -------------------");
//			System.out.print("Enter the Name of the Student : ");
//			name = sc.nextLine();
//			System.out.println("Enter Your Batch : ");
//			branch = sc.nextLine();
//			System.out.println("Enter the Number of People Accompanying You : ");
//			noOfPeople = sc.nextInt();
//			
//			if(noOfPeople > 4) {
//				
//				throw new MoreThan4People("\nNot More than 4 People can Accompany!!");
//				
//			}else if(noOfPeople == 0) {
//				
//				throw new NoPeople("\nThere Must Few ");
//				
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}	
//		
//	
//	}
//
//}
