package array;

import java.util.Scanner;

public class Array_3d_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][][] a = new int[3][2][5];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				for(int k = 0; k < a[i][j].length; k++) {
					
					System.out.print("Enter A["+ i +"]["+ j +"]["+ k +"] : ");
					a[i][j][k] = sc.nextInt();
					
				}//end of 3rd for
				
			}//end of 2nd for
			
		}//end of 1st for 
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				for(int k = 0; k < a[i][j].length; k++) {
					
					System.out.println("A["+ i +"]["+ j +"]["+ k +"] : " + a[i][j][k]);
					
				}//end of 3rd for
				
			}//end of 2nd for
			
		}//end of 1st for 
		
	}

}
