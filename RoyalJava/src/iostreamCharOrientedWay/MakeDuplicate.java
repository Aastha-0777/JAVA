package iostreamCharOrientedWay;

import java.io.FileReader;
import java.io.FileWriter;

public class MakeDuplicate {
	
	public static void main(String[] args) {
		
		try
		(
		
				FileReader fr = new FileReader("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\src\\iostreamCharOrientedWay\\writeInFile.java");
				FileWriter fw = new FileWriter("DuplicateOfWriteFile.txt");
				
		) 
		{
			
			int temp;
			
			while((temp = fr.read()) != -1) {
				
				fw.write((char)temp);
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
