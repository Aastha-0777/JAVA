package morningjava;

import java.util.Scanner;

public class FinalyDemo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();
		System.out.print("Enter a String : ");
		String str2 = sc.nextLine();
		
		if (str1 != null || str2 != null) {
			
			System.out.println((str1.substring(0, 1).toUpperCase() + str1.substring(1)) + " " + (str2.substring(0, 1).toUpperCase() + str2.substring(1)));
			
		} else {
				
			try {
				
				str1.toUpperCase();
				str2.toUpperCase();
				
			} catch (NullPointerException e) {

				e.printStackTrace();
				
			}finally{
				
				System.out.println("This is the Finally Block!!");
				
			}

		}
		
		
		
	}

}
