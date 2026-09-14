package runtimepoly.practice;

public class LoanCustomer extends Customer{

	@Override
	public void getService() {

		System.out.println("LoanCustomer ---> getService()");
	
	}
	
	public void getLoanDetails() {
		
		System.out.println("Customer : LoanCustomer ---> getLoanDetails() ---> Loan Details");
		
	}//end of getLoanDetails
	
}
