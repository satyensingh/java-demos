package com.moneymoney.test;

import java.util.Iterator;
import java.util.Set;

import com.moneymoney.account.BankAccount;
import com.moneymoney.account.CurrentAccount;
import com.moneymoney.account.SavingsAccount;
import com.moneymoney.account.list.BankList;
import com.moneymoney.entity.Customer;

public class Test {
	
	public static void main(String[] args) {
		BankList bankList = new BankList();
		
		bankList.addNewAccount(new SavingsAccount(new Customer(101,"Vinay"),1000, false));
		bankList.addNewAccount(new SavingsAccount(new Customer(102,"Satyen"),2000, false));
		bankList.addNewAccount(new SavingsAccount(new Customer(103,"Vikram"),true));
		bankList.addNewAccount(new CurrentAccount(new Customer(104,"Pooja"),10_000,1000));
		bankList.addNewAccount(new CurrentAccount(new Customer(105,"Dinesh"),20_000,1500));
		
		
		Set<BankAccount> accounts = bankList.getAccounts();
		for (BankAccount bankAccount : accounts) {
			System.out.println(bankAccount);
		}
		
//		Iterator<BankAccount> accountItr = accounts.iterator();
//		while(accountItr.hasNext()) {
//			System.out.println(accountItr.next());
//		}
		
	}
}