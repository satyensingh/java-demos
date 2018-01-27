package com.moneymoney.test;

import com.moneymoney.account.CurrentAccount;
import com.moneymoney.account.SavingsAccount;
import com.moneymoney.account.exception.InsufficientFundsException;
import com.moneymoney.entity.Customer;

//Method Overriding 
/*
* Rules of Method overriding
* 1) MethodName and Parameters must match
* 2) return type must be same or sub type.
* 3) Access Specifiers must be same or higher.
* 4) overriding method cannot throw exceptions not thrown by overridden method
* 5) overriding method may or may not throw exception thrown by overridden method
* 6) Overriding method can only throw same or subtype of exceptions thrown by overridden method
*/
public class Test {
	
	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount(new Customer(201,"Satyen"),10_000,true);
		
		System.out.println(savingsAccount.getAccountBalance());
		try {
			savingsAccount.withdraw(11_000);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(savingsAccount.getAccountBalance());
		
		CurrentAccount account = new CurrentAccount(new Customer(202,"Vikram"), 10_000, 1000);
		System.out.println(account.getAccountBalance());
		try {
			account.withdraw(11_000);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(account.getAccountBalance());
		
	}
}