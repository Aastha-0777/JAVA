package oop.polymor.runtime;

public class PublicPlace extends Person{
	
	@Override
	public void getBehave() {
		
		System.out.println("PublicPlace - getBehave() --> Citizen Behaviour");
		
	}//end of getBehave
	
	public void getPublicEentInfo() {
		
		System.out.println("PublicPlace : getPublicEentInfo() : Public Event Info");
		
	}//end of getPublicEentInfo
	
}
