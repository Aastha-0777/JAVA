package oop.finaltopic;

public class A {

	// data member/ instance variables
	
	final int no;// = 10;
	
	A(){
		
		no = 100;
		
	}
	
	A(int no){
		
		this.no = no;
		
	}
	
	public static void main(String[] args) {
	
		A obj = new A(67);
		
		System.out.println("No : " + obj.no);
		
	
//		local variables
//		
//		 final int no = 100;
//		
//		System.out.println("No : " + no);
//
//		no = 67;
//		
//		System.out.println("Updated No : " + no);
		
		
		
	}
	
}
