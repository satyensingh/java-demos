
public class Test {

	public static void main(String[] args) {
		
		Customer satyen = new Customer();
		satyen.setCustomerID(201);
		satyen.setCustomerName("Satyen");
		
		SavingsAccount account = new SavingsAccount(satyen, true);
		satyen.setBankAccount(account);
		
		Customer vikram = new Customer();
		vikram.setCustomerID(202);
		vikram.setCustomerName("Vikram");
		
		
		SavingsAccount account2 = new SavingsAccount(vikram,10_000, false);
		vikram.setBankAccount(account2);
		
		
		Customer pooja = new Customer();
		pooja.setCustomerID(202);
		pooja.setCustomerName("Pooja");
		
		CurrentAccount account3 = new CurrentAccount(pooja, 20_000, 1000);
		pooja.setBankAccount(account3);
		
		
		System.out.println(account);
		System.out.println(account2);
		System.out.println(account3);
		
	}

}




