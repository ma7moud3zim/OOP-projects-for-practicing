package banks;

import java.util.Scanner;

public class BankingDemo {
	public static void main(String[] args) {
	BankAccount a1 = new BankAccount("Ahmed","1234");
	a1.showMenu();
	}
}

class BankAccount 
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount (String cname, String cid){
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		
		if(amount != 0) {
			balance += amount;
			previousTransaction = amount;
		}	
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance -= amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0) {
			System.out.println("Deposoited: " + previousTransaction);
		}
		
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else  {
			System.out.println("No transactions occured");
		}
		
	}
	
	void showMenu()
	{
	char option = '\0';
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Welcome " + customerName);
	System.out.println("Your ID is " + customerId );
	System.out.println();
	System.out.println("A. Check Balance.");
	System.out.println("B. Deposit.");
	System.out.println("C. Withdraw.");
	System.out.println("D. Previous Transaction.");
	System.out.println("E. Exit The Application.");
	
	do {
		System.out.println("======================================");
		System.out.println("Enter an Option: ");
		System.out.println("======================================");
		option = sc.next().charAt(0);
		
		switch(option) {
		
		case 'A':
			System.out.println("Balance = " +balance);
			System.out.println("\n");
			break;

		case 'B':
			System.out.println("Enter an amount to Deposit: ");
			int amount = sc.nextInt();
			deposit(amount);
			System.out.println('\n');
			break;
		
		case 'C':
			System.out.println("Enter an amount to Withdraw: ");
			int amount2 = sc.nextInt();
			withdraw(amount2);
			System.out.println('\n');
			break;
		
		case 'D':
			getPreviousTransaction();
			System.out.println('\n');
			break;	
		case 'E':
			break;
			
			default:
				System.out.println("Enter a valid character");
		
		}
		
		
	}
	while(option != 'E');
		
		System.out.println("Thank you for using our application.");
	}
}