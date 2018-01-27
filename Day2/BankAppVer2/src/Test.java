//Client Class
public class Test {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.accountNumber = 101;
		savingsAccount.accountHolderName = "Satyen";
		savingsAccount.accountBalance = 10_000;
		savingsAccount.salary = true;
		
		savingsAccount.withdraw(1000);
		String data = savingsAccount.displayAccountDetails();
		System.out.println(data);

		savingsAccount.deposit(2000);
		System.out.println(savingsAccount.displayAccountDetails());
		
	}

}
