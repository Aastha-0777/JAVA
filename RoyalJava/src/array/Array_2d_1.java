package array;

import java.util.Scanner;

public class Array_2d_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][5];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print("Enter A["+ i +"]["+ j +"] : ");
				a[i][j] = sc.nextInt();
				
			}//end of inner for
			
		}//end of outer for

		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.println("A["+ i +"]["+ j +"] : " + a[i][j]);
				
			}//end of inner for
			
		}//end of outer for

		
	}
	
}
