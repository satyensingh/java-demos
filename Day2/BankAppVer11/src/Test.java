public class Test {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("Satyen", 10_000, true);
		
		SavingsAccount savingsAccount2 = new SavingsAccount("Vikram", false);	
		
		
		System.out.println(savingsAccount.displayAccountDetails());
		System.out.println(savingsAccount2.displayAccountDetails());
		
	}

}




