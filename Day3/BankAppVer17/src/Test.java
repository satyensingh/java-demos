
public class Test {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount("Satyen", true);
		SavingsAccount account2 = new SavingsAccount("Vikram",10_000, false);
		CurrentAccount account3 = new CurrentAccount("Pooja", 20_000, 1000);
		
		System.out.println(account);
		System.out.println(account2);
		System.out.println(account3);
		
	}

}




