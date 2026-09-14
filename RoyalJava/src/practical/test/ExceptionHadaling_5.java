package practical.test;

import java.util.Scanner;

public class ExceptionHadaling_5 {

	/*
	 * 
	 * 	1. Age Validation
	 *	2. Password Validation
	 *	3. ATM Withdrawal
	 *	4. Marks Validation
	 * 
	 * */
	
	public static void isValidMarks(float avg) throws InvalidMarks {

		
		if(avg >= 35) {
			
			System.out.println("Marks Valid For Admition!!");
			
		}else {
			
			throw new InvalidMarks("\n\"InValid Marks For Admition!!\n\tCandidate Must have marks Greater than 34!!\"");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of Maths : ");
		int maths= sc.nextInt();
		System.out.println("Enter marks of Science : ");
		int sci = sc.nextInt();
		System.out.println("Enter marks of English : ");
		int eng = sc.nextInt();
		
		float avg = (float)((maths + sci + eng) / 3);
		
		try {
			
			isValidMarks(avg);
			
		}catch (InvalidMarks m) {

			m.printStackTrace();

		}

		
	}
	
}
