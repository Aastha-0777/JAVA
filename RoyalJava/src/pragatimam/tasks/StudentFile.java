package pragatimam.tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentFile {
	
	public static void main(String[] args) throws IOException {
		
		
		try
		(
		
				FileInputStream fin = new FileInputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\StudentFile.txt");
				FileOutputStream fout = new FileOutputStream("StudentFile.txt");
				
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
				ObjectInputStream oin = new ObjectInputStream(fin);
				
		){
			
			Student s1 = new Student();
			s1.getDetails();
			
			if(s1.getName().length() < 3 || s1.getName().contains("1234567890!@#$%^&*()-_+={}[]|\"';:.>/?<,")) {
				
				throw new InvalidName("Invalid Name!!\n\t Must not Contain any special symbol and must be greater than 3 letter!!");
				
			}else {
				
				out.writeObject(s1);
				Student s = (Student)oin.readObject();
				
				System.out.println(s.getName() + " " + s.getCourse());
				
			}
			
			
			
		}catch(InvalidName e){
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}

/*
 * 
 * Input the Customer's Name, City, and Parcel Number.

Write the parcel details into a file.

Read the tracking details from the file.

Handle exceptions using try-catch.
Check whether the Name  & city contains only characters (A-Z, a-z).
Parcel Number --> Digits

min 4 , max 6
 * 
 * */
