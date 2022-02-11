package oop;

public class BankAccount {
	//Define Variables
	String accountNumber;
	//static means belongs to the class not object instance 
	//final means it will be a constant for the whole code
	static final String routingNumber = "13542";
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	//Define Constructors
		//1. Has no return type
		//2. Implicitly called upon initialization
	
	BankAccount(){
		System.out.println("New Account Created !!");
	}
	BankAccount(String accountType){
		
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initdeposit){
		System.out.println("New Account: " + accountType);
		//System.out.println(" Initial Balance: " + initdeposit);
		String Msg;
		if(initdeposit<1000) {
			Msg = "Sorry the minimum deposited balance should be $1000";
		}else {
			Msg = "Thanks for depositing the initial amount of $ " + initdeposit;
		}
		System.out.println(Msg);
		balance += initdeposit;
	}
	
	//Define Methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
}
