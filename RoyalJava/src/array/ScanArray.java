package array;

import java.util.Scanner;

public class ScanArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		
		System.out.println("a.length : " + a.length);
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("Enter a["+ i +"] : ");
			a[i] = sc.nextInt();
			
		}//end of for
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.println("a["+ i +"] : " + a[i]);
			
		}//end of for
		
		
		
	}
	
}
