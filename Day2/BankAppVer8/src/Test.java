//Constructor Overloading
public class Test {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(101, "Satyen", 10_000, true);
		
		//To open Zero balance account
		SavingsAccount savingsAccount2 = new SavingsAccount(102,"Vikram", false);	
		
		
		System.out.println(savingsAccount.displayAccountDetails());
		System.out.println(savingsAccount2.displayAccountDetails());
		
	}

}




