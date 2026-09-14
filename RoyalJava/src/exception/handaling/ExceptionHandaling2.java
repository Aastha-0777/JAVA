package exception.handaling;

import java.util.Scanner;

public class ExceptionHandaling2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		try{
			
			try {
				
				ans = no1 / no2;
				
				
			}catch(ArithmeticException e) {
				
				e.printStackTrace();
				
			}
			
			try {
				
				String a = null;
				System.out.println("a.length() : " + a.length());
			
				
			}catch(NullPointerException n) {
				
				n.printStackTrace();
				
			}
			
			try {
				
				int arr[] = new int[5];
				System.out.println("arr[5] : " + arr[5]);
				
			}catch(ArrayIndexOutOfBoundsException a) {
				
				a.printStackTrace();
				
			}
	
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception Handaled - Exception");
			
		}finally {
			
			System.out.println("Hello I am Finally Block!!");
			
		}
		
		System.out.println("Answer : " + ans);
		
	}	
	
	
}
