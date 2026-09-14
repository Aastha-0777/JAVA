package basicApplications;

public class Calculator {
	
	
	public float add(float num1, float num2) {
		
		return  num1 + num2;	
		
	}//end of add
	
	public float diff(float num1, float num2) {
		
		return  num1 - num2;	
		
	}//end of diff
	
	public float product(float num1, float num2) {
		
		return  num1 * num2;	
		
	}//end of product
	
	public float div(float num1, float num2) {
		
		return  num1 / num2;	
		
	}//end of div
	
	public float mod(float num1, float num2) {
		
		return  num1 % num2;	
		
	}//end of mod

	public float sqr(float num1) {
		
		return  num1 * num1;	
		
	}//end of sqr

	public float cube(float num1) {
		
		return  num1 * num1 * num1;	
		
	}//end of cube

	public float sqrt(float num1) {
		
		return  num1;
		
	}//end of sqrt

	public float pow(float num1, float num2) {
		
		int ans = 1;
		
		for(int i = 1; i <= num2; i++) {
			
			ans *= num1;
			
		}//end of for
	
		return ans;
		
	}//end of pow

	public int factorial(int num1) {
		
		int c = 1;
		
		if(num1 == 0 || num1 == 1) {
			
			return 1;
			
		}else {
			
			c = num1 * factorial(num1 - 1);
			
		}//end of if-else
		
		return c;
		
	}//end of factorial

	public boolean isPrime(int num1) {
		
		int fc = 0;
		
		for(int i = 1; i <= num1; i++) {
			
			if(num1 % i == 0) {
				
				fc++;
				
			}//end of if
			
		}//end of for
		
		if(fc == 2) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end of if-else 
		
	}//end of isPrime 
	
	public boolean isEven(int num1) {
		
		if(num1 % 2 == 0) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end of if-else
		
	}//end of isEven

	public float largestOf2(float num1, float num2) {
		
		if(num1 > num2) {
			
			return num1;
			
		}else {
			
			return num2;
			
		}//end of if-else
		
	}//end of largestOf2

	public float largestOf3(float num1, float num2, float num3) {
		
		if(num1 > num2 && num1 > num3) {
			
			return num1;
			
		}else if(num2 > num1 && num2 > num3) {

			return num2;
			
		}else {
			
			return num3;
			
		}//end of if-else ladder	
		
	}//end of largestOf3

	public void swap(float num1, float num2) {
		
		float temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Number 1 and 2 after Swaping : "  + num1 + num2);
		
	}//end of swap

	public float fibonacci(float num1, float num2) {
		
		return  num1;	
		
	}//end of fibonacci

	public int reverse(int num) {
		
		int digit = 0;
		int rev = 0;
		
		while(num != 0) {
			
			digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
			
		}//end of while
		
		return rev;
		
	}//end of reverse
	
	public boolean isPalindrome(int num) {
		
		if(num == reverse(num)) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end of if-else
		
	}//end of isPalindrome
	
	public boolean isArmstrong(int num) {
		
		return false;	
		
	}//end of isArmstrong

	public float percent(float total, float part) {
		
		return  (part / total) * 100;	
		
	}//end of add

}
