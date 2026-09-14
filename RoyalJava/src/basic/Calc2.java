package basic;
import java.util.Scanner;

public class Calc2 {
	
	public static void main(String[] args) {
		
		System.out.println("=============== CALCULATOR ==============");
		
		Scanner sc = new Scanner(System.in);
		
		float a, b;
		
		System.out.print("Enter No1 : ");
		a = sc.nextFloat();
		
		System.out.print("Enter No2 : ");
		b = sc.nextFloat();
		
		System.out.println("Sum : " + (a + b));
		System.out.println("Difference : " + (a - b));
		System.out.println("Product : " + (a * b));
		System.out.println("Quotient : " + (a / b));
		
	}

}
