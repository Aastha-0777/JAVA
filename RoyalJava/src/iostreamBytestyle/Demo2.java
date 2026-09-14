package iostreamBytestyle;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Full Name : ");
		String fname = sc.nextLine();
		
		FileOutputStream fout = null;
		
		try {
			
			fout = new FileOutputStream("Demo2.txt");
		
			byte[] name = fname.getBytes();
			
			fout.write(name);
		
			System.out.println("Name Written Successfully!!");
			
		} catch (Exception e) {

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
