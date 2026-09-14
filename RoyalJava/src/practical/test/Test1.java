package practical.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {

	/*
	 * 
	 * Handle `ArithmeticException`, `ArrayIndexOutOfBoundsException`, and `NumberFormatException`.
## 3. Try-Catch-Finally
//
 4. FileOutputStream – Write File
//
//**Question:** Create `student.txt` and write student information.
 FileInputStream – Read File
 File Copy Using Streams ⭐
//
	 * 
	 * */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//			try {
//				
//				System.out.print("Enter a Number to divide : ");
//				int num = sc.nextInt();
//				
//				int ans = 100/num;
//
//				System.out.println("Answer : " + ans);
//				
//				sc.nextLine();
//				
//				System.out.print("Enter a String : ");
//				String str1 = sc.nextLine();
//				
//				Integer.parseInt(str1);
//				
//				int arr[] = new int[5];
//				
//				System.out.println(arr[5]);
//
//		
//			} catch (Exception e) {
//
//				e.printStackTrace();
//
//			}

//		StringBuilder sb = new StringBuilder();
//		
//		try 
//		(
//		
//				FileInputStream fin = new FileInputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\Demo1.txt");
//				
//		)
//		{
//			
//			int temp;
//			
//			while((temp = fin.read()) != -1) {
//				
//				sb = sb.append((char)temp);
//				
//			}//end of while
//			
//			System.out.println(sb);
//			
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		}
//		

		try 
		(
		
				FileInputStream fin = new FileInputStream("C:\\Users\\v7000\\eclipse-workspace\\RoyalJava\\Demo1.txt");

				FileOutputStream fout = new FileOutputStream("CopyDemo1.txt");
				
		)
		{
			
			int temp;
			
			while((temp = fin.read()) != -1) {
				
				fout.write(temp);
		
			}//end of while
			
			System.out.println("File Copied Successfully!!");
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
}
