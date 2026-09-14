package oop.abstraction;

public class C extends A{

	@Override
	public void test1() {

		System.out.println("C : test1()");

	}
	
	@Override
	public void test2() {

		System.out.println("C : test2()");

	}
	
	@Override
	public void test3() {

		System.out.println("C : test3()");

	}
	
	public void test7() {
		
		System.out.println("C : test7()");
		
	}
	
	public static void main(String[] args) {
		
		A obj = new C();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		
		if(obj instanceof B) {
			
			B objB = (B)obj;
			
			objB.test6();
			
		}else if(obj instanceof C) {
			
			C objC = (C)obj;
			
			objC.test7();
			
		}
		
	}
	
}
