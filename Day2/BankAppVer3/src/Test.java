//Client Class
public class Test {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		
//		savingsAccount.accountNumber = 101;
//		savingsAccount.accountHolderName = "Satyen";
//		savingsAccount.accountBalance = 10_000;
//		savingsAccount.salary = true;
		savingsAccount.setAccountBalance(10_000);
		
		savingsAccount.withdraw(1000);
		System.out.println(savingsAccount.displayAccountDetails());

		savingsAccount.deposit(2000);
		System.out.println(savingsAccount.displayAccountDetails());
		
	}

}
