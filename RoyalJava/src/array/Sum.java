package array;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("Enter a["+ i +"] : ");
			a[i] = sc.nextInt();
					
		}//end of for
		
		for(int i = 0; i < a.length; i++) {
			
			sum += a[i];
			System.out.println("a["+ i +"] : " + a[i]);
			
		}//end of for
		
		System.out.println("The Sum of Array is : " + sum);
		
	}

}
