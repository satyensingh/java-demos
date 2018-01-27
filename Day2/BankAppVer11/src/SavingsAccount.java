public class SavingsAccount {
	// Instance member - non-static variables are one per instance
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private boolean salary;

	//private static int accountIdCounter = 100;//Bad Practice to initalize member at the time of declaration
	private static int accountIdCounter;
	
	//Static Initializers gets invoked everytime a class is loaded.
	//get invoked only once as class loads only once.
	//cannot access non-static variables(Instance member) from static Initializers/function(context)
	static {
		accountIdCounter = 100;
	}
	
	
	{
		this.accountNumber = ++accountIdCounter;
	}

	public SavingsAccount(String accountHolderName, double accountBalance, boolean salary) {
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.salary = salary;
	}

	public SavingsAccount(String accountHolderName, boolean salary) {
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
		data = data + "Account No. : " + accountNumber + "\n";
		data = data + "Account Holder Name : " + accountHolderName + "\n";
		data = data + "Account Balance : " + accountBalance + "\n";
		data = data + "Salary? : " + salary + "\n\n";
		return data;
	}
}