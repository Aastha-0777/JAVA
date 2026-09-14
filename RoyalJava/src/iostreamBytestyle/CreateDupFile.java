package iostreamBytestyle;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CreateDupFile {
	
	public static void main(String[] args) {
		
		try
		(
				
				FileInputStream fin = new FileInputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\Demo1.txt");
				FileOutputStream fout = new FileOutputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\Demo1Dup.txt");
				
		) 
		{
			
			int temp;
			
			while((temp = fin.read()) != -1) {
				
				fout.write(temp);
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
