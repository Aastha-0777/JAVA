package oop.intrerfaceTask2;

public class PremiumCustomer implements Customer{

	@Override
	public void getService() {

		System.out.println("PremiumCustomer : getService() --> Premium Customer Service");

	}
	
	public void getLoungeAccess() {
		
		System.out.println("PremiumCustomer : getLoungeAccess() --> Lounge Access");
		
	}
	
}
