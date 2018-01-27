
public class SavingsAccount {
	//Instance Members
	int accountNumber;
	String accountHolderName;
	double accountBalance;
	boolean salary;
	
	void withdraw(double amount) {
		accountBalance = accountBalance - amount;
	}
	void deposit(double amount) {
		accountBalance = accountBalance + amount;
	}
	
	void displayAccountDetails() {
		System.out.println("Account Details are as follows:-");
		System.out.println("Account No. : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Salary? : "+salary);
	}
}
