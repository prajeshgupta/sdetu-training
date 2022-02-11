package oop;


public class BankAcoountApp {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "84782438724";
		System.out.println("Account Number Generated " + acc1.accountNumber);
		System.out.println();
		
		BankAccount acc2 = new BankAccount("Current Account");
		acc2.accountNumber = "48246387383";
		System.out.println("Account Number Generated " + acc2.accountNumber);
		System.out.println();
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "24687244874";
		System.out.println("Account Number Generated " + acc3.accountNumber);
		acc3.checkBalance();
		System.out.println();
	}
}
