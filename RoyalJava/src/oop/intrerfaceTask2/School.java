package oop.intrerfaceTask2;

public class School implements Person{

	@Override
	public void getBehave() {

		System.out.println("School : getBehave() --> Student");
	
	}	
	
	public void getResult() {
		
		System.out.println("School : Student : getResult() : Result");
		
	}
	
}
