package runtimepoly.practice;

import java.util.Scanner;

public class BankCustomerBS {
	
	Scanner sc = new Scanner(System.in);
	
	public static void getSpecificMethod(Customer customer) {
		
		customer.getService();
		
		if(customer instanceof SavingsCustomer) {
			
			SavingsCustomer scus = (SavingsCustomer)customer;
			
			scus.getPassbook();
			
		}else if(customer instanceof CurrentCustomer) {
			
			CurrentCustomer ccus = (CurrentCustomer)customer;
			
			ccus.getChequeBook();
			
		}else if(customer instanceof LoanCustomer) {
			
			LoanCustomer lcus = (LoanCustomer)customer;
			
			lcus.getLoanDetails();
			
		}else {
			
			PremiumCustomer pcus = (PremiumCustomer)customer;
			
			pcus.getLoungeAccess();
			
		}//end of if-else ladder
		
	}//end of getSpecificMethod
	
	public static void main(String[] args) {
		
		BankCustomerBS bc = new BankCustomerBS();
				
		while(true) {
			
			System.out.println("------------- Bank Customer Behavior System -------------");
			System.out.println("1. For Savings Customer.");
			System.out.println("2. For Current Customer.");
			System.out.println("3. For Loan Customer.");
			System.out.println("4. For Premium Customer.");
			System.out.println("5. For Exiting the Application.");
			System.out.print("Enter From the Above Choices : ");
			int choice = bc.sc.nextInt();
			
			switch (choice) {
			
			case 1 : {
				
					SavingsCustomer obj = new SavingsCustomer();
					getSpecificMethod(obj);
				
			} break;
			
			case 2 : {
				
					CurrentCustomer obj = new CurrentCustomer();
					getSpecificMethod(obj);
				
			} break;
			
			case 3 : {
				
					LoanCustomer obj = new LoanCustomer();
					getSpecificMethod(obj);
				
			} break;
			
			case 4 : {
				
					PremiumCustomer obj = new PremiumCustomer();
					getSpecificMethod(obj);
				
			} break;
			
			case 5 : {
				
					System.out.println("Exiting the Bank Customer Behavior System Application...");
					System.exit(0);
				
			} break;
			
			default : System.out.println("Invaild Choice!!");
			
			}//end of switch 
			
		}//end of while
		
	}

}
