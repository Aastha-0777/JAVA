package iostreamBytestyle;

import java.io.FileInputStream;

public class ReadingFromFile {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		FileInputStream fin = null;
		
		try{
			
			
			// 1. Open File Connection
			
			fin = new FileInputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\Demo1.txt");
			
			//2. File Operation
			
			int temp;
			
								// -1 --> EOF
								// 	^
								//  |
			while ((temp = fin.read()) != -1) {

				sb.append((char)temp);

			}
			
			//3. Close File Connection
			
			fin.close();
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
		System.out.println("Final String : " + sb);
		
	}

}
