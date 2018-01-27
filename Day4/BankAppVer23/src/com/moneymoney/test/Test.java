package com.moneymoney.test;

import com.moneymoney.account.CurrentAccount;
import com.moneymoney.account.SavingsAccount;
import com.moneymoney.entity.Customer;


public class Test {
	
	public static void main(String[] args) {
		//BankAccount is abstract hence cannot be instantiated
		//BankAccount account = new BankAccount("Satyen",10000);
		
		SavingsAccount savingsAccount = new SavingsAccount(new Customer(201,"Satyen"),10_000,true);
		
		System.out.println(savingsAccount.getAccountBalance());
		savingsAccount.withdraw(11_000);
		System.out.println(savingsAccount.getAccountBalance());
		
		CurrentAccount account = new CurrentAccount(new Customer(202,"Vikram"), 10_000, 1000);
		System.out.println(account.getAccountBalance());
		account.withdraw(11_000);
		System.out.println(account.getAccountBalance());
		
	}
}