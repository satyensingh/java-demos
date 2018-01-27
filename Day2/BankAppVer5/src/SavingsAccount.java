public class SavingsAccount {
	//Instance member 
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private boolean salary;
	
	void withdraw(double amount) {
		accountBalance = accountBalance - amount;
	}
	void deposit(double amount) {
		accountBalance = accountBalance + amount;
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
	
	/*
	 * "this" is a current object
	 * It helps us to avoid naming conflict
	 * When a function has parameter name same as instance member, we must distinguish between
	 * them using "this" keyword.
	 * Using "this" means refering to instance member instead of parameter variable.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		//accountNumber = accountNumber;//statement will assign value to itself, not instance member.
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
}
