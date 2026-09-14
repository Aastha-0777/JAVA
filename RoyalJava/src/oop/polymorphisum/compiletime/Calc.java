package oop.polymorphisum.compiletime;

public class Calc {

	public void addFun(long no1, long no2) {
		
		System.out.println("addFun(int no1, int no2) : " + (no1 + no2));
		
	}
	
	public void addFun(double no1, double no2) {
		
		System.out.println("addFun(int no1, int no2) : " + (no1 + no2));
		
	}
	
	public void addFun(int no1, int no2, int no3) {
		
		System.out.println("addFun(int no1, int no2, int no3) : " + (no1 + no2 + no3));
		
	}

	public void addFun(int no1, int no2, int no3, int no4) {
		
		System.out.println("addFun(int no1, int no2, int no3, int no4) : " + (no1 + no2 + no3 + no4));
		
	}
	
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		c.addFun(100, 200);
		c.addFun(10.0f, 20.0f);
		
	}

	
}
