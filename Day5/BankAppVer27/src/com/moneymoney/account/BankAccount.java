package com.moneymoney.account; 

import com.moneymoney.account.exception.InsufficientFundsException;
import com.moneymoney.entity.Customer;

public abstract class BankAccount {
	public static final double INTEREST_RATE = 0.4;
	
	private final int accountNumber;
	private Customer customer;
	private double accountBalance;

	private static int accountIdCounter;
	
	static {
		accountIdCounter = 100;
	}
	
	{
		this.accountNumber = ++accountIdCounter;
	}

	public BankAccount(Customer customer, double accountBalance) {
		this.customer = customer;
		this.accountBalance = accountBalance;
	}

	public BankAccount(Customer customer) {
			this.customer = customer;
	}

	static int getNextAccountNumber() {
		return accountIdCounter+1;
	}
	
	public abstract void withdraw(double amount) throws InsufficientFundsException;

	public void deposit(double amount) {
		if(amount>0) {
			accountBalance = accountBalance + amount;
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public Customer getAccountHolderName() {
		return customer;
	}

	public void setAccountHolderName(Customer customer) {
		this.customer = customer;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		return true;
	}

	public String toString() {
		String data = null;
		data = "***********Account Details are as follows:-*******************\n";
		data = data + "Account No. : " + accountNumber + "\n";
		data = data + "Account Holder Name : " + customer.getCustomerName() + "\n";
		data = data + "Account Balance : " + accountBalance + "\n";
		return data;
	}

}
