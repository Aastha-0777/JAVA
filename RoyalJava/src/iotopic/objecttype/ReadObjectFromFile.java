package iotopic.objecttype;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
	
	public static void main(String[] args) {
		
		try
		(
		
				FileInputStream fin = new FileInputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\ObjectFile.txt");
				
				ObjectInputStream oin = new ObjectInputStream(fin);
				
		) 
		{

			Student s = (Student)oin.readObject();
			
			System.out.println(s.getRollNo() + " " + s.getName() + " " + s.getStd() + " " + s.getMarks());
			
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
