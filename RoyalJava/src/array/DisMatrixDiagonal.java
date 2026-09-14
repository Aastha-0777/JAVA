package array;

import java.util.Scanner;

public class DisMatrixDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][3];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
				
			}//end of inner for
			
		}//end of outer for
		
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				if(i == j) {
					
					System.out.print(a[i][j] + "\t");
					
				}else{
					
					System.out.print("\t");
					
				}//end of if - else
				
			}//end of inner for
			
			System.out.println();
			
		}//end of outer for
		
	}
	
}
