package practical.test;

import java.util.Scanner;

public class Library {

	/*
	 make a libiairy and print 
	 book id 
	 title
	 author 
 	 status
 	 */
	
	public static void main(String[] args) {
		
		int bookId;
		String title;
		String author;
		String status;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of Book You Want to add to the Librairy : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("======================= ENTER BOOK'S DETAILS ====================");
			
			System.out.print("Enter the Book's Id : ");
			bookId = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Book's Title : ");
			title = sc.nextLine();
			System.out.print("Enter the Book's Auther's Name : ");
			author = sc.nextLine();
			System.out.print("Enter the Book's Status (Available/Unavailable) : ");
			status = sc.nextLine();
			System.out.println("Book is Added Successfully!!");
			
			System.out.println("======================= BOOK'S DETAIL =====================");
			
			System.out.println("Book Id : " + bookId);
			System.out.println("Book Title : " + title);
			System.out.println("Book Author : " + author);
			System.out.println("Book Status : " + status);
			 
		}//end of for
		
	}
	
}
