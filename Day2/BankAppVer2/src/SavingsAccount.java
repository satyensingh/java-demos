//Business Logic - Service Layer - Bean Class
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
