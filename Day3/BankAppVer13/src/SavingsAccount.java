public class SavingsAccount {
	
	public static final double INTEREST_RATE = 0.4;
	
	private final int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private boolean salary;

	private static int accountIdCounter;
	
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

	static int getNextAccountNumber() {
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

	public String toString() {
		String data = null;
		data = "***********Account Details are as follows:-*******************\n";
		data = data + "Account No. : " + accountNumber + "\n";
		data = data + "Account Holder Name : " + accountHolderName + "\n";
		data = data + "Account Balance : " + accountBalance + "\n";
		data = data + "Salary? : " + salary + "\n\n";
		return data;
	}
}
