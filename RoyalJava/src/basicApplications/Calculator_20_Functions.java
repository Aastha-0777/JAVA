package basicApplications;

import java.util.Scanner;

public class Calculator_20_Functions {

	public static void main(String[] args) {
		
		/*
Make a Calculator with 20 Functionalities in Java  
 	Addition 
   	Subtraction
  	Multiplication
  	Division
  	Modulus
  	Square
  	Cube
  	Square Root
  	Power
  	Factorial
	Prime Number
	Check Even/Odd 
	Check Largest of Two Numbers
	Largest of Three 
	Numbers Swap Two Numbers
	Fibonacci Series
	Reverse Number
	Palindrome Number Check 
	Armstrong Number Check
	Percentage Calculation
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		int choice;
		int num;
		float num1, num2, num3;
		
		do {
			
			System.out.println("================================= CALCULATOR =================================");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Square");
			System.out.println("7. Cube");
			System.out.println("8. Square Roor");
			System.out.println("9. Power");
			System.out.println("10. Factorial");
			System.out.println("11. Prime Number");
			System.out.println("12. Check Even/Odd");
			System.out.println("13. Check Largest of Two Numbers");
			System.out.println("14. Check Largest of Three Numbers");
			System.out.println("15. Swap Two Numbers");
			System.out.println("16. Fibonacci Series");
			System.out.println("17. Reverse Number");
			System.out.println("18. Check Palindrome Number");
			System.out.println("19. Check Armstrong Number");
			System.out.println("20. Percentage Calculator");
			System.out.print("Enter From Above Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				System.out.println("Addition : " + c.add(num1, num2));
				
			} break;
			
			case 2 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				System.out.println("Difference : " + c.diff(num1, num2));
				
			} break;
			
			case 3 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				System.out.println("Product : " + c.product(num1, num2));
				
			} break;
			
			case 4 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				System.out.println("Division : " + c.div(num1, num2));
				
			} break;

			case 5 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				System.out.println("Modulus : " + c.mod(num1, num2));
				
			} break;
			
			case 6 : {
				
				System.out.print("Enter a Number : ");
				num1 = sc.nextFloat();
				
				System.out.println("Square : " + c.sqr(num1));
				
			} break;

			case 7 : {
				
				System.out.print("Enter a Number : ");
				num1 = sc.nextFloat();
				
				System.out.println("Cube : " + c.cube(num1));
				
			} break;
			
			case 8 : {
				
				System.out.println("This Function Will be Added Shortly!!");
				
			} break;
			
			case 9 : {
				
				System.out.print("Enter a Number : ");
				num1 = sc.nextFloat();
				System.out.print("Enter the Power : ");
				num2 = sc.nextFloat();
				
				System.out.println(num1 + " Raise to the Power " + num2 + " is : " + c.pow(num1, num2));
				
			} break;

			case 10 : {
				
				System.out.print("Enter Number to find it's Factorial : ");
				num = sc.nextInt();
				
				System.out.println("Factorial : " + c.factorial(num));
				
			} break;
						
			case 11 : {
				
				System.out.print("Enter the Number to Check Prime: ");
				num = sc.nextInt();
				
				if(c.isPrime(num)) {
					
					System.out.println(num + " is a Prime Number.");
					
				}else {
					
					System.out.println(num + " is Not a Prime Number.");
 					
				}//end of if - else
				
			} break;

			case 12 : {
				
				System.out.print("Enter the Number to Check Even/Odd : ");
				num = sc.nextInt();
				
				if(c.isEven(num)) {
					
					System.out.println(num + " is a Even Number.");
					
				}else {
					
					System.out.println(num + " is Odd Number.");
 					
				}//end of if - else
				
			} break;

			case 13 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				System.out.println(c.largestOf2(num1, num2) + " is the Largest.");
				
			} break;
			
			case 14 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				System.out.print("Enter Number 3 : ");
				num3 = sc.nextFloat();
				
				System.out.println(c.largestOf3(num1, num2, num3) + " is the Largest.");
				
			} break;

			case 15 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				c.swap(num1, num2);
				
			} break;
			
			case 16 : {
				
				System.out.print("Enter Number 1 : ");
				num1 = sc.nextFloat();
				System.out.print("Enter Number 2 : ");
				num2 = sc.nextFloat();
				
				c.fibonacci(num1, num2);
				
			} break;
			
			case 17 : {
				
				System.out.print("Enter the Number : ");
				num = sc.nextInt();
				
				System.out.println("Reverse Number : " + c.reverse(num));
				
			} break;
			
			case 18 : {
				
				System.out.print("Enter the Number : ");
				num = sc.nextInt();
				
				if(c.isPalindrome(num)) {
					
					System.out.println(num + " is a Palindrome Number.");
					
				}else {
					
					System.out.println(num + " is Not a Palindrome Number.");
					
				}//end of if - else
				
			} break;
			
			case 19 : {
				
				System.out.print("Enter the Number : ");
				num = sc.nextInt();
				
				System.out.println(c.isArmstrong(num));
				
			} break;
			
			case 20 : {
				
				System.out.print("Enter the total : ");
				num1 = sc.nextFloat();
				System.out.print("Enter the part : ");
				num2 = sc.nextFloat();
				
				System.out.println("Percentage : " + c.percent(num1, num2));
				
			} break;

			case 21 : {
				
				System.out.println("Exiting the Calculator...");
				
			} break;
			
			default : System.out.println("Invalid Chioce!");
			
			}//end of switch - case
			
		}while(choice != 21);
		
		
	}
	
}
