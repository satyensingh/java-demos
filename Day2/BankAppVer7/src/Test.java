
public class Test {

	public static void main(String[] args) {
		//SavingsAccount Object must get created with detail of account holder
		SavingsAccount savingsAccount = new SavingsAccount(101, "Satyen", 10_000, true);
		
		//Error - As No, Default Ctor Available.
		//SavingsAccount account = new SavingsAccount();
		
//		savingsAccount.setAccountNumber(101);
//		savingsAccount.setAccountBalance(10_000);
//		savingsAccount.setAccountHolderName("Satyen");
//		savingsAccount.setSalary(true);
//		
		savingsAccount.withdraw(1000);
		System.out.println(savingsAccount.displayAccountDetails());

		savingsAccount.deposit(2000);
		System.out.println(savingsAccount.displayAccountDetails());
		
	}

}




