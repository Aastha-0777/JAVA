package practical.test;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileHandaling {
	
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
		
		
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();	
		
		try (FileOutputStream fout = new FileOutputStream("hello.txt");){
			
			byte[] b = str1.getBytes();
			
			fout.write(b);
					
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
