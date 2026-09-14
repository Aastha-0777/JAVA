package iostreamBytestyle;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String demoStr = sc.nextLine();
		
		FileOutputStream fout = null;
		
		try {
			
			//1. open the connection
			
			fout = new FileOutputStream("Demo1.txt");
			
			//2. operation part
			
			byte[] b = demoStr.getBytes();
			
			fout.write(b);			
			
			System.out.println("Success!!");
			
		}catch (Exception e) {

			e.printStackTrace();
			
		}finally {
			
			try {
				
				fout.close();
				
			} catch (Exception e2) {

				e2.printStackTrace();
				
			}
			
		}
		
		
	}
	
}
