package iotopic.objecttype;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeWrite {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Arjun", 98754f, "xyz", "abc");
		
		try
		(
		
				FileOutputStream fout = new FileOutputStream("EmployeeFile.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
				
		) 
		{
			
			out.writeObject(e1);

			System.out.println("Object Written Successfully!!");
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
}
