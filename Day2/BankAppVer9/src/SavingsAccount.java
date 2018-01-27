public class SavingsAccount {
	//Instance member - non-static variables are one per instance
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private boolean salary;
	
	//Class Member - static variables are one per class
	//static variables are shared by all the objects of the same class.
	private static int accountIdCounter;
	
	public SavingsAccount(String accountHolderName, double accountBalance, boolean salary) {
		this.accountNumber = ++accountIdCounter;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.salary = salary;
	}
	public SavingsAccount(String accountHolderName, boolean salary) {
		this.accountNumber = ++accountIdCounter;
		this.accountHolderName = accountHolderName;
		this.salary = salary;
	}

	void withdraw(double amount) {
		accountBalance = accountBalance - amount;
	}
	void deposit(double amount) {
		accountBalance = accountBalance + amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public boolean isSalary() {
		return salary;
	}
	public void setSalary(boolean salary) {
		this.salary = salary;
	}
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
