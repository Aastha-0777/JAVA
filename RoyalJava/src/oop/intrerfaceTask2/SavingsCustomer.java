package oop.intrerfaceTask2;

public class SavingsCustomer implements Customer{

	@Override
	public void getService() {

		System.out.println("SavingsCustomer : getService() --> Saving Acc Details");

	}
	
	public void getPassbook() {
		
		System.out.println("SavingsCustomer : getPassbook() --> Passbook");
		
	}

}
