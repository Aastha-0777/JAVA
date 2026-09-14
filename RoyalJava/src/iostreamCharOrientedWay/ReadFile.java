package iostreamCharOrientedWay;

import java.io.FileReader;

public class ReadFile {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		try(FileReader fr = new FileReader("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\record.txt")) 
		{
			
			int temp;
			
			while((temp = fr.read()) != -1) {
				
				sb.append("" + (char)temp);
				
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		
		}
		
		System.out.println("Final String : " + sb);
		
	}

}
