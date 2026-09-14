package runtimepoly.practice;

public class CurrentCustomer extends Customer{

	@Override
	public void getService() {
		
		System.out.println("CurrentCustomer --> getService()");
		
	}
	
	public void getChequeBook() {
		
		System.out.println("Customer : CurrentCustomer --> getChequeBook() --> Cheque Book");
		
	}//end of getChequeBook
	
}
