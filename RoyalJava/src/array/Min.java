package array;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("Enter the a["+ i +"] : ");
			a[i] = sc.nextInt();
			
		}//end of for
		
		int min = a[0];
		
		for(int i = 0; i < a.length; i++) {
			
			if(min > a[i]) {
				
				min = a[i];
				
			}//end of if
			
		}//end of for
		
		System.out.println("The Min of Array is : " + min);
		
	}
	
}
