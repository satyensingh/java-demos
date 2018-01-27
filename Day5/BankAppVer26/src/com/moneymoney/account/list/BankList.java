package com.moneymoney.account.list;

import java.util.HashSet;
import java.util.Set;

import com.moneymoney.account.BankAccount;

public class BankList {
	private Set<BankAccount> accounts;

	public BankList() {
		accounts = new HashSet<>();
	}

	public Set<BankAccount> getAccounts() {
		return accounts;
	}

	public void addNewAccount(BankAccount ba) {
		accounts.add(ba);
	}
}