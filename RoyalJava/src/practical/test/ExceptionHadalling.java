package practical.test;

import java.text.ParseException;
import java.util.Scanner;

public class ExceptionHadalling {

	/*
	 * 
	 * 		ArithmeticException
			ArrayIndexOutOfBoundsException
			NumberFormatException
			NullPointerException
			try-catch-finally
			Multiple catch
	 * 
	 * */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("Enter Number 1 : ");
			int a = sc.nextInt();
			System.out.println("Enter Number 2 : ");
			int b = sc.nextInt();
			
			int ans = a / b;
			
			int[] arr = new int[5];
			System.out.println("arr[5] : " + arr[5]);
			
			System.out.println("Enter a String : ");
			String str1 = sc.nextLine();
			
			int num = Integer.parseInt(str1);
			System.out.println(num);
			
			System.out.println("Enter a String : ");
			String s = sc.nextLine();
			
			
		}catch (ArithmeticException e) {

			e.printStackTrace();
			
			System.out.println("Exception Handled by : ArithmeticException");
			
		}catch (ArrayIndexOutOfBoundsException ar) {

			ar.printStackTrace();

			System.out.println("Exception Handled by : ArrayIndexOutOfBoundsException");
			
		}catch (NumberFormatException nf) {

			nf.printStackTrace();
			
			System.out.println("Exception Handled by : NumberFormatException");

		}catch (NullPointerException np) {

			np.printStackTrace();
			
			System.out.println("Exception Handled by : NullPointerException");

		}finally {
			
			System.out.println("This is Finally Block!!");
			
		}
		
	}
	
}
