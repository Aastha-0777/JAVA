package iotopic.objecttype;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingObjArrFromFile {

	public static void main(String[] args) {
		
		try 
		(
		
				FileInputStream fin = new FileInputStream("ObjArr.txt");
				
				ObjectInputStream oin = new ObjectInputStream(fin);
				
		)
		{
			
			
			Student[] s = (Student[])oin.readObject();
		
			for (int i = 0; i < s.length; i++) {
				
				System.out.println("Name : " + s[i].getName() + " Std : " + s[i].getStd() + " Roll NO. : " + s[i].getRollNo() + " Marks : " + s[i].getMarks());
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
	}
	
}
