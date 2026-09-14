package object.practice;

import java.util.Scanner;

public class BankAccount {
	
	int accountNumber;
	String accountHolderName;
	double balance;
	
	public BankAccount() {

		balance = 10000;

	}
	
	void deposit(double amount) {
		
		balance += amount;
		
		System.out.println("Deposit : " + amount);
		
	}
	
	void withdraw(double amount) {
		
		if(balance < amount || balance == 0) {
			
			System.out.println("You Don't Have Enoungh Balance!!");
			
		}else {
			
			balance -= amount;
			System.out.println("Withdraw : " + amount);
			
		}
		
	}
	
	
	void displayBalance() {
		
		System.out.println("Current Balance : " + balance);
		
	}
	
	void displayAccountDetails() {
		
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Initial Balance : " + balance);
		
	}

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Account Number : ");
		ba.accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Account Holder Name : ");
		ba.accountHolderName = sc.nextLine();
		
		ba.displayAccountDetails();
		ba.deposit(5000);
		ba.withdraw(3000);
		ba.displayBalance();
		
	}
	
}
