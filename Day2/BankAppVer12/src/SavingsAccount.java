public class SavingsAccount {
	// Instance member - non-static variables are one per instance
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private boolean salary;

	private static int accountIdCounter;
	
	static {
		accountIdCounter = 100;
		
		/*
		 * Static Functions/Initializers(context) cannot access non-static members
		 * because, non-static members gets memory allocation when the object/instance is created.
		 * Whereas, static members get memory allocation when the class is loaded.
		 * So, If The class is loaded but their exist Zero instance of that class and if the static
		 * context uses any non-static members then it will not able to find it because it does not exist
		 * in the memory.
		 *  
		 */
		//System.out.println(accountNumber);
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

	//Static Functions can be called without using object/instance.
	static int getNextAccountNumber() {
		//System.out.println(accountNumber);//non-static cannot be accessed from static context
		return accountIdCounter+1;
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
