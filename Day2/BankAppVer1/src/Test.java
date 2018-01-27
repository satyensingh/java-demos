
public class Test {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.accountNumber = 101;
		savingsAccount.accountHolderName = "Satyen";
		savingsAccount.accountBalance = 10_000;
		savingsAccount.salary = true;
		
		savingsAccount.withdraw(1000);
		savingsAccount.displayAccountDetails();

		savingsAccount.deposit(2000);
		savingsAccount.displayAccountDetails();
		
		
		SavingsAccount savingsAccount2 = new SavingsAccount();
		savingsAccount2.accountNumber = 102;
		savingsAccount2.accountHolderName = "Vikram";
		savingsAccount2.accountBalance = 20_000;
		savingsAccount2.salary = false;

		savingsAccount2.withdraw(3000);
		savingsAccount2.displayAccountDetails();
		
		savingsAccount2.deposit(5000);
		savingsAccount2.displayAccountDetails();
	}

}
