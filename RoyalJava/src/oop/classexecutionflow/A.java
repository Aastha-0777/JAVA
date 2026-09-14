package oop.classexecutionflow;

public class A {
	
	//static block
	static {
		
		System.out.println("static block : 1 --- 1");
		
	}
	static {
		
		System.out.println("static block : 2 --- 2");
		
	}
	
	//static method 
	
	static void test1() {
		
		System.out.println("static method : test1() --- 4");
		
	}
	
	//instance block
	
	{
		
		System.out.println("instace block : 1 --- 5");
		
	}
	
	{
		
		System.out.println("instance block : 2 --- 6");
		
	}
	
	//constructor
	
	A(){
		
		System.out.println("Default Constructor --- 7");
		
	}//end of default constructor
	
	A(int no){
		
		System.out.println("PARA Constructor --- 7");
		
	}//end of PARA constructor
	
	// non-satic method 
	
	void test2() {
				
		System.out.println("Non-Static Method --- 8");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("START : Main Method --- 3");

		A.test1();
		
		A obj1 = new A();
		//A obj2 = new A(0);
		
		obj1.test2();
		
		System.out.println("EXIT: Main Method --- 9");
		
	}

}
