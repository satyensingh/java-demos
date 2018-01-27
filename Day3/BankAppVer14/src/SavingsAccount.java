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
		this.accountHolderName = accountHolderName;//Encapsulation
		this.accountBalance = accountBalance;
		this.salary = salary;
	}

	public SavingsAccount(String accountHolderName, boolean salary) {
			this.accountHolderName = accountHolderName;//Encapsulation
			this.salary = salary;
	}

	static int getNextAccountNumber() {
		return accountIdCounter+1;//Encapsulation
	}
	
	void withdraw(double amount) {
		accountBalance = accountBalance - amount;//Encapsulation
	}

	void deposit(double amount) {
		accountBalance = accountBalance + amount;//Encapsulation
	}

	public int getAccountNumber() {
		return accountNumber;//Encapsulation
	}

	public String getAccountHolderName() {
		return accountHolderName;//Encapsulation
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;//Encapsulation
	}

	public double getAccountBalance() {
		return accountBalance;//Encapsulation
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;//Encapsulation
	}

	public boolean isSalary() {
		return salary;//Encapsulation
	}

	public void setSalary(boolean salary) {
		this.salary = salary;//Encapsulation
	}

	public String toString() {
		String data = null;//Encapsulation
		data = "***********Account Details are as follows:-*******************\n";
		data = data + "Account No. : " + accountNumber + "\n";
		data = data + "Account Holder Name : " + accountHolderName + "\n";
		data = data + "Account Balance : " + accountBalance + "\n";
		data = data + "Salary? : " + salary + "\n\n";
		return data;
	}
}
