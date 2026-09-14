package morningjava;

public class ExceptionEx {
	
	
	public static void main(String[] args) {

		
		try {
			
			int arr[] = new int[5];
			
			// arr - 0 : 4 
			int a = Integer.parseInt("abc");
			
			System.out.println("arr[5] : " + arr[5]);

			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
			System.out.println("You Can't Access the Array of Maximum Size!");
			
		}
		
	}
	

}
