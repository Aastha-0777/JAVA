package practical.test;

import java.util.Scanner;

public class Volume {

	//Write a Java program to overload a volume() method to calculate:
	//
	//Cube
	//Cuboid
	//Cylinder
	//
	//
	
	final double PI = 3.14;
	
	Scanner sc = new Scanner(System.in);
	
	public void volume(int a) {
		
		System.out.println("The Volume of Cube is : " + (a * a * a));
		
	}//end of volume for cube
	
	public void volume(int l, int b, int h) {
		
		System.out.println("The Volume of the Cuboid is : " + (l * b * h));
		
	}
	
	public void volume(int r, int h) {
		
		System.out.println("The Volume of the Cylinder is : " + (PI * r * r * h));
		
	}
	
	public static void main(String[] args) {
		
		Volume v = new Volume();
		int choice;
		int a, l, b, h, r;
		
		while(true) {
			
			System.out.println("1) Volume of Cube.");
			System.out.println("2) Volume of cuboid.");
			System.out.println("3) Volume of Cylinder.");
			System.out.println("4) Exit");
			System.out.print("Enter Your Choice : ");
			choice = v.sc.nextInt();
			
			switch(choice) {
			
			case 1: System.out.print("Enter the Value of Side : ");
					a = v.sc.nextInt();
					v.volume(a);
					break;
					
			case 2: System.out.print("Enter the Value of Length : ");
					l = v.sc.nextInt();
					System.out.print("Enter the Value of Breadth : ");
					b = v.sc.nextInt();
					System.out.print("Enter the Value of Height : ");
					h = v.sc.nextInt();
					v.volume(l, b, h);
					break;
					
			case 3: System.out.print("Enter the Value of Radius : ");
					r = v.sc.nextInt();
					System.out.print("Enter the Value of Height : ");
					h = v.sc.nextInt();
					break;
			
			case 4: System.exit(0);
					break;
			
			default : System.out.println("Invalid Choice!!");
			
			}//end of switch
			
		}//end of while
		
	}
	
}
