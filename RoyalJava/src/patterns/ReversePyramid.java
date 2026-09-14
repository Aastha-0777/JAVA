package patterns;

public class ReversePyramid {
	
	public static void main(String[] args) {
		
		/*
		 
		  * * * * *
		   * * * *
		 	* * *
		 	 * *
		 	  * 
		 
		 */
		
		for(int i = 1; i <= 5; i++) {
			
				for(int j = 1; j < i; j++) {
				
					System.out.print(" ");
				
				}//end of 1st inner for
			
				for(int k = 1; k <= 5 - i + 1; k++) {
				
					System.out.print("* ");
				
				}//end of 2nd inner for
			
				System.out.println();
			
			}//end of outer loop
		
	}

}
