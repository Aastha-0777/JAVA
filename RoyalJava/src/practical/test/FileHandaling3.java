package practical.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Scanner;

public class FileHandaling3 {
	
	/*
	 * 
	 *
	 * Write a Java program to create a file and write "Hello Java" into it using FileWriter.
	   Write a Java program to read and display the contents of a text file using FileReader.
       Write a program to write 10 student names into a file and then read them back.
	   Write a Java program to copy the contents of one file into another file using FileInputStream and FileOutputStream.
	   Write a program to write 10 integers into a file and read and display them.
	 * 
	 * */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] student = new String[10];
		
		for (int i = 0; i < student.length; i++) {

			System.out.print("Enter the Name of Student " + (i + 1) + " : ");
			student[i] = sc.nextLine();
			
		}
	
		StringBuilder str1 = new StringBuilder();
	
		try (
				FileOutputStream fout = new FileOutputStream("student.txt");
				FileInputStream fin = new FileInputStream("student.txt");
				
			){
			
			
			for (int i = 0; i < student.length; i++) {
				
				byte[] b = student[i].getBytes();
				fout.write(b);
				
			}
			
			int temp;
			
			while((temp = fin.read()) != -1) {
				
				str1.append((char) temp);				
			
			}
		
			System.out.println(str1);
					
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
