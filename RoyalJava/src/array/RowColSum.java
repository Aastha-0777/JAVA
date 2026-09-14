package array;

import java.util.Scanner;

public class RowColSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][]a = new int[3][3];
	
		int[] c = new int[3];
		int rowSum = 0, colSum = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
				
			}//end of inner for
			
		}//end of outer for
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				
				colSum += a[j][i];
				rowSum += a[i][j];
				System.out.print(a[i][j] + "\t");
				
			}//end of inner for
			
			c[i] = colSum;
			System.out.print("=" + rowSum);
			System.out.println();
			
		}//end of outer for
		
		
		for(int j = 0;  j < a.length; j++) {
			
			System.out.print("=" + c[j] + "\t");		
			
		}//end of for
		
	}
	
}
