package oop.intrerfaceTask2;

public class PublicPlace implements Person{

	@Override
	public void getBehave() {

		System.out.println("PublicPlace : getBehave() --> Citizen");

	}
	
	public void getPublicEventInfo() {
		
		System.out.println("PublicPlace : Citizen : getPublicEventInfo() : Public Event Info");
		
	}

}
