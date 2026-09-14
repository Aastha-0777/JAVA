package oop.abs.runtimepoly;

public class PublicPlace extends Person{
	
	@Override
	public void getBehave() {

		System.out.println("PublicPlace -- gerBehave() --> Citizen Behaviour");
	
	}
	
	public void getPublicEventInfo() {
		
		System.out.println("PublicPlace : Citizen : getPublicEventInfo() : Event Info");
		
	}

}
