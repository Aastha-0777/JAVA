package array;

import java.util.Scanner;

public class DisMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][3];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
				
			}//end of inner for
			
			System.out.println();
			
		}//end of outer for
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j] + "\t");
				
			}//end of inner for
			
			System.out.println();
			
		}//end of outer for
		
	}
	
}
