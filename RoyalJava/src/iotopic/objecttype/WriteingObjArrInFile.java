package iotopic.objecttype;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriteingObjArrInFile {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) {
		
			System.out.print("Enter the Student's id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Student's name : ");
			String name = sc.nextLine();
			System.out.print("Enter the Student's std : ");
			int std = sc.nextInt();
			System.out.print("Enter the Student's Marks : ");
			int marks = sc.nextInt();
		
			s[i] = new Student(id, name, std, marks);
		
		}
		
		try 
		(
		
				FileOutputStream fout = new FileOutputStream("ObjArr.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
				
		)
		{
			
			out.writeObject(s);

			System.out.println("Successfull!!");
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
