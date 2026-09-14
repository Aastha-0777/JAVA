package practical.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Scanner;

public class FileHandaling7 {
	
	/*
	 * 
	 *
	 * 
	   
	   Write a Java program to create a file and write "Hello Java" into it using FileWriter.
	   Write a Java program to read and display the contents of a text file using FileReader.
       Write a program to write 10 student names into a file and then read them back.
	   Write a Java program to copy the contents of one file into another file using FileInputStream and FileOutputStream.
	   Write a program to write 10 integers into a file and read and display them.
	   
	   -------------------------------------------------------------------------------------------------------------------------
	   
	   Write a program to count the number of characters in a text file.
	   Write a program to count the number of words in a text file. ----> remaining to complete
	   Write a program to count the number of lines in a text file.
	   Write a program to append new text to an existing file without deleting the old content.
	   Write a program to check whether a particular file exists or not.
	   
	   -------------------------------------------------------------------------------------------------------------------------
	   
	   Write a program to display the file name, path, size, and whether the file is readable/writable.
	   Write a program to read a file character by character using FileReader.
 	   Write a program to write data character by character using FileWriter.
	   Write a program using FileInputStream to read a binary file.
	   Write a program using FileOutputStream to write byte data into a file.
	   
	 * 
	 * */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		try (
				
				FileInputStream fin = new FileInputStream("integers.txt");
				
			){
			
			
			int temp;
			int wordCounter = 0;
			
			while((temp = fin.read()) != -1) {
				
				System.out.println(temp);
				
				if(((char)temp) == '\n') {
					
					wordCounter++;
					
				}
				
				
			}
			
			System.out.println("Number of Charcter in the file are : " + wordCounter);
					
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

}
