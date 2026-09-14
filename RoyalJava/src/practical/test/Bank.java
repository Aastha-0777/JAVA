package practical.test;

public class Bank {
	
	/*
	
	BANK MENU
	1. View All Accounts
	2. Deposit
	3. Withdraw
	4. Search Account
	5. Exit
	Enter Choice: 
	
	  */
	
	private int accNo;
	private float amount;
	private String name;
	
	Bank(int accNo, float amount, String name){
		
		this.accNo = accNo;
		this.amount = amount;
		this.name = name;
		
	}//end of constructor.
	
	public void display() {
		
		System.out.println("Accout Holder : " + name);
		System.out.println("Accout Number : " + accNo);
		System.out.println("Accout Balance : " + amount);
		System.out.println();
		
	}//end of display
	
	public void deposit(float dipAmount) {
		
		amount += dipAmount;
		System.out.println("The Amount " + dipAmount + " Diposited Successufully!!");
		
	}//end of deposit
	
	public void withdraw(float withAmount) {
		
		amount -= withAmount;
		System.out.println("The Amount " + withAmount + " Withdrawed Successufully!!");
		
	}//end of withdraw
	
	public boolean searchAcc(int accountNo) {
		
		if(accountNo == accNo) {
			
			return true;
			
		}else {
			
			return false;
			
		}//end of if-else
		
	}//end of searchAcc

}
