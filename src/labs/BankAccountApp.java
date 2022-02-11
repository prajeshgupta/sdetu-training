package labs;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874");
	}
}

class BankAccount{
	//Properties					
	private static int id=1000;			// Internal id
	private String accountNumber;	//id + random 2 digit number + first 2 of ssn
	private String routingNumber;
	private String name;
	private String ssn;
	private double balance;
	
	//Constructor
	public BankAccount(String ssn) {
		System.out.println("New Account Created");
		id++;
		System.out.println(id);
	}
	
}