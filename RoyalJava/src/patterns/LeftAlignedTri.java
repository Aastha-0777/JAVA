package patterns;

public class LeftAlignedTri {
	
	public static void main(String[] args) {
		
		/*
		   
		   * 
		   ** 
		   *** 
		   **** 
		   ***** 
		
		*/
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}//end of inner for
			
			System.out.print("\n");
			
		}//end of outer for
		
	}

}
