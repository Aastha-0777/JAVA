package stringtopic.mutableandimmutable;

public class DemoStr {

	public static void main(String[] args) {
		 
		//mutable way
		
		StringBuilder firstName = new StringBuilder("Aastha");
		StringBuilder lastName = new StringBuilder("Lakhatariya");
		
		System.out.println("firstName : " + firstName + "-------------" + firstName.hashCode());
		System.out.println("lastName : " + lastName + "-------------" + lastName.hashCode());
		
		//mutable behavior
		
		firstName.append(lastName);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("firstName : " + firstName + "-------------" + firstName.hashCode());
		System.out.println("lastName : " + lastName + "-------------" + lastName.hashCode());
		
		//Immutable way

		
	}
	
}
