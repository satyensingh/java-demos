package com.moneymoney.test;

import com.moneymoney.account.BankAccount;
import com.moneymoney.account.CurrentAccount;
import com.moneymoney.account.SavingsAccount;
import com.moneymoney.account.list.BankList;
import com.moneymoney.entity.Customer;

public class Test {
	static void performPrint(BankList list){
		BankAccount[] bankAccList = list.printAll();
		for (BankAccount bankAccount : bankAccList) {
			System.out.println(bankAccount);
		}
	}
	public static void main(String[] args) {
		
		BankList bankList = new BankList(3);
		
		bankList.addNewAccount(new SavingsAccount(new Customer(201,"Satyen"), true));
		bankList.addNewAccount(new SavingsAccount(new Customer(202,"Vikram"), 10_000, false));
		bankList.addNewAccount(new CurrentAccount(new Customer(203,"Pooja"),20_000, 1_000));
		
		performPrint(bankList);
		
	}
}