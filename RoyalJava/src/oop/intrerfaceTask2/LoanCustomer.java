package oop.intrerfaceTask2;

public class LoanCustomer implements Customer{

	@Override
	public void getService() {

		System.out.println("LoanCustomer : getService() --> Loan Customer Service");

	}
	
	public void getLoanDetails() {
		
		System.out.println("LoanCustomer : getLoanDetails() --> Loan Detail");
		
	}

}
 	