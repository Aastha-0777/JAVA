package array;

import java.util.Scanner;

public class PrintPrimeInArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fc = 0;
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("Enter a[" +  i  + "] : ");
			a[i] = sc.nextInt();
			
		}//end of 1st for
	
		for(int i = 0; i < a.length; i++) {
			
			int no = a[i];
			fc = 0;
			
			for(int j = 1; j <= no; j++) {
				
				if(no % j == 0) {
					
					fc++;
					
				}//end of inner if
				
			}//end of inner for
			
			if(fc == 2) {
				
				System.out.println("Prime : " + no);
			
			}//end of 2nd inner for
			
		}//end of 2nd for
		
	}

}
