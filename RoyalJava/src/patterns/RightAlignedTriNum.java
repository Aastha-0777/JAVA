package patterns;

public class RightAlignedTriNum {

	public static void main(String[] args) {
		
		/*
		 
		 1
		12
	   123
	  1234 
	 12345
	 	 
		 */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5 - i; j++) {
				
				System.out.print(" ");
				
			}//end of 1st inner loop
			
			for(int k = 1; k <= i; k++) {
				
				System.out.print(k);
				
			}//end of 2nd inner loop
			
			System.out.print("\n");
			
		}//end of outer for
		
	}
	
}
