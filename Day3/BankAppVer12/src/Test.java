
public class Test {

	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount("Satyen",true);
		String data = account.displayAccountDetails();
		System.out.println(data);
		
		//First remove private modifier from accountNumber in SavingsAccount class and then try this.
		//account.accountNumber = 102;//Error, as accountNumber is Final.
		
		//System.out.println(SavingsAccount.getInterestRate());
		System.out.println(SavingsAccount.INTEREST_RATE);
		
		
	}

}




