package practical.test;

public class Addition {

	/*
	 * 
	 * //Write a Java program to demonstrate method overloading by creating different addFun() methods to add:
//
//Two integers
//Two double values
//Three integers
//Four integers
	 * 
	 * */
	
	public void addFun(int no1, int no2) {
		
		System.out.println("Sum : " + (no1 + no2));
		
	}
	
	public void addFun(double no1, double no2) {
		
		System.out.println("Sum : " + (no1 + no2));
		
	}

	public void addFun(int no1, int no2, int no3) {
		
		System.out.println("Sum : " + (no1 + no2 + no3));
		
	}

	public void addFun(int no1, int no2, int no3, int no4) {
		
		System.out.println("Sum : " + (no1 + no2 + no3 + no4));
		
	}
	
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		obj.addFun(60, 7);
		obj.addFun(60, 7.67);
		obj.addFun(20, 40, 7);
		obj.addFun(20, 20, 20, 7);
		
	}

	
}
