package morningjava;

class A extends Thread{
	
	public void run() {
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("This is Class A " + Thread.currentThread().getClass());
			
		}
		
	}
	
}

class B extends Thread{
	
	public void run() {
		
		for(int i = 0; i < 3; i++) 
		{
			
			System.out.println("This is Class B " + Thread.currentThread().getClass());
			
		}
		
	}
	
}

class C extends Thread{
	
	public void run() {
		
		for(int i = 0; i < 3; i++) 
		{
			
			System.out.println("This is Class C " + Thread.currentThread().getClass());
			
		}
		
	}
	
}


public class ThereadingExample {

	
	public static void main(String[] args) {
		
		A objA = new A();
		B objB = new B();
		C objC = new C();
		
		objA.start();
		objB.start();
		objC.start();
		
	}
	
	
}
