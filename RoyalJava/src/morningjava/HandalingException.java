package morningjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandalingException {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		
		try {
			
			System.out.print("Enter the Value for A : ");
			a = sc.nextInt();
			System.out.print("Enter the Value for B : ");
			b = sc.nextInt();

			c = a / b;
			
		}catch (ArithmeticException ar) {
			
			ar.printStackTrace();

			System.out.println("Please Don't Enter 0 as 2nd Value.");

		}catch (InputMismatchException i) {

			i.printStackTrace();
			
			System.out.println("Please Enter Only Integer Values.");
			
		}
		
	}
	
}
