package oop.polymor.runtime;

public class Student extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("Student - getBehave() --> Student Behaviour");
		
	}//end of getBehave
	
	public void getResult() {
		
		System.out.println("Student : getResult() : Resutlt");
		
	}//end of getResult
	
}
