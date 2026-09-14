package exception.handaling;

import java.util.Scanner;

public class ArithExceptionHandaling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		try {
			
			ans = no1 / no2;
			
			String a = null;
			
			int arr[] = new int[5];
			System.out.println("arr[5] : " + arr[5]);
			
			System.out.println("a.length() : " + a.length());
		
		}catch(ArithmeticException | NullPointerException e) {
			
			e.printStackTrace();
			System.out.println("Exception Handaled - " + e.getClass().getName());
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception Handaled - Exception");
			
		}finally {
			
			System.out.println("Hello I am Finally Block!!");
			
		}
		
		System.out.println("Answer : " + ans);
		
	}	
	
	
}
