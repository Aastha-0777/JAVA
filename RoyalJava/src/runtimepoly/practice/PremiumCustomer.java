package runtimepoly.practice;

public class PremiumCustomer extends Customer{

	@Override
	public void getService() {

		System.out.println("PremiumCustomer ---> getService()");
	
	}
	
	public void getLoungeAccess() {
		
		System.out.println("Customer : PremiumCustomer ---> getLoungeAccess() ---> Lounge Access");
		
	}//end of getLoungeAccess
	
}
