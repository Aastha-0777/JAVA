package runtimepoly.practice;

public class SavingsCustomer extends Customer {

	@Override
	public void getService() {
		
		System.out.println("SavingsCustomer --> getService()");
		
	}
	
	public void getPassbook() {
		
		System.out.println("Customer : SavingsCustomer --> getPassbook() --> Pass Book");
		
	}//end of getPassbook

}
