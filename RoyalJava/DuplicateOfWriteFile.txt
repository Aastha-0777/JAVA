package iostreamCharOrientedWay;

import java.io.FileWriter;
import java.util.Scanner;

public class writeInFile {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a String : ");
		String st = sc.nextLine();
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("record.txt");
			
			fw.write(st);
			
			fw.close();
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
}
