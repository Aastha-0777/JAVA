package iotopic.objecttype;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjIntoFile {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Aastha", 12, 98.67f);
		
		try
		(
		
				FileOutputStream fout = new FileOutputStream("ObjectFile.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
				
		) 
		{
			
			out.writeObject(s1);
			
			System.out.println("Object Written Successfully!!");
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
}
