package practical.test;

import java.util.Scanner;

public class Area {

	//Write a Java program using method overloading //to calculate the area of:
	//Square
	//Rectangle
	//Circle
	
	final double PI = 3.14;
	
	Scanner sc = new Scanner(System.in);
	
	public void area(int a) {
		
		System.out.println("The Area of Square is : " + (a * a));
		
	}//end of area for cube
	
	public void area(int l, int b) {
		
		System.out.println("The area of the Rectangle is : " + (2* (l + b)));
		
	}
	
	public void area(double r) {
		
		System.out.println("The area of the Circle is : " + (PI * r * r));
		
	}
	
	public static void main(String[] args) {
		
		Area ar = new Area();
		int choice;
		int a, l, b;
		double r;
		
		while(true) {
			
			System.out.println("1) Area of Square.");
			System.out.println("2) Area of Rectangle.");
			System.out.println("3) Area of Circle.");
			System.out.println("4) Exit");
			System.out.print("Enter Your Choice : ");
			choice = ar.sc.nextInt();
			
			switch(choice) {
			
			case 1: System.out.print("Enter the Value of Side : ");
					a = ar.sc.nextInt();
					ar.area(a);
					break;
					
			case 2: System.out.print("Enter the Value of Length : ");
					l = ar.sc.nextInt();
					System.out.print("Enter the Value of Breadth : ");
					b = ar.sc.nextInt();
					ar.area(l, b);
					break;
					
			case 3: System.out.print("Enter the Value of Radius : ");
					r = ar.sc.nextInt();
					ar.area(r);
					break;
			
			case 4: System.exit(0);
					break;
			
			default : System.out.println("Invalid Choice!!");
			
			}//end of switch
			
		}//end of while
		
	}
	
}
