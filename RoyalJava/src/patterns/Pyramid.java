package patterns;

public class Pyramid {

	public static void main(String[] args) {
		
		/*
		 
		 *			 
		* *
	   * * *
	  * * * *
	 * * * * *
	  
		 */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5 - i; j++) {
				
				System.out.print(" ");
				
			}//end of 1st inner for
			
			for(int k = 1; k <= i; k++) {
				
				System.out.print("* ");
				
			}//end of 2nd inner for
			
			System.out.println();
			
		}//end of outer loop
		
	}
	
}
