package practical.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileHandaling2 {
	
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
		
	
		StringBuilder str1 = new StringBuilder();
	
		try (FileInputStream fin = new FileInputStream("hello.txt");){
			
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
