//Business Logic - Service Layer - Bean Class
public class SavingsAccount {
	//Instance Members
	//Hide all the instance member from direct access using 'private'
	//Making instance members private means, they are not accessible from outside the class.
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private boolean salary;
	
	//After making instance member private, we need to add 2 functions for
	//setting(writing/updating) the values and getting(reading) the values.
	//These functions are called as Setters and Getters.
	
	//Setter
	void setAccountBalance(double newBalance) {
		if(newBalance>0) {
			accountBalance = newBalance;
		}
	}
	//Getter
	double getAccountBalance() {
		return accountBalance;
	}
	
	void withdraw(double amount) {
		accountBalance = accountBalance - amount;
	}
	void deposit(double amount) {
		accountBalance = accountBalance + amount;
	}
	
	//Always Return the data to the caller/Client api
	//As a Class Developer, you should never assume the ouput format.
	String displayAccountDetails() {
		String data = null;
		data = "***********Account Details are as follows:-*******************\n";
		data = data + "Account No. : "+accountNumber+"\n";
		data = data + "Account Holder Name : "+accountHolderName+"\n";
		data = data + "Account Balance : "+accountBalance+"\n";
		data = data + "Salary? : "+salary+"\n\n";
		return data;
	}
}
