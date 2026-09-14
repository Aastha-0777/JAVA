package oop.intrerfaceTask2;

public class CurrentCustomer implements Customer{

	@Override
	public void getService() {

		System.out.println("CurrentCustomer : getService() --> Current Customer Service");

	}
	
	public void getChequeBook() {
		
		System.out.println("CurrentCustomer : getChequeBook() --> Cheque Book");		
		
	}

}
