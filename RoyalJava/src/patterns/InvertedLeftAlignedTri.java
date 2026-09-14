package patterns;

public class InvertedLeftAlignedTri {

	public static void main(String[] args) {
		
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *	
	 
		 */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 5; j >= i; j--) {
				
				System.out.print("*");
				
			}//end of inner for
			
			System.out.println();
			
		}//end of outer for
		
	}
	
}
