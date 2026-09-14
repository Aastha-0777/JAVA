package practical.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Scanner;

public class FileHandaling5 {
	
	/*
	 * 
	 *
	 * Write a Java program to create a file and write "Hello Java" into it using FileWriter.
	   Write a Java program to read and display the contents of a text file using FileReader.
       Write a program to write 10 student names into a file and then read them back.
	   Write a Java program to copy the contents of one file into another file using FileInputStream and FileOutputStream.
	   Write a program to write 10 integers into a file and read and display them.
	   
	   -------------------------------------------------------------------------------------------------------------------------
	   
	   Write a program to count the number of characters in a text file.
	   Write a program to count the number of words in a text file.
	   Write a program to count the number of lines in a text file.
	   Write a program to append new text to an existing file without deleting the old content.
	   Write a program to check whether a particular file exists or not.
	   
	 * 
	 * */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		try (
				FileOutputStream fout = new FileOutputStream("studentDup.txt");
				FileInputStream fin = new FileInputStream("student.txt");
				
			){
			
			
			int temp;
			
			while((temp = fin.read()) != -1) {
				
				fout.write(temp);			
			
			}
					
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
