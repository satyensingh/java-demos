package com.moneymoney.account;

import com.moneymoney.entity.Customer;

public class CurrentAccount extends BankAccount {
	
	private double odLimit;

	public CurrentAccount(Customer customer, double accountBalance, double odLimit) {
		super(customer, accountBalance);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	@Override
	public String toString() {
		return super.toString() + "OD Limit : "+odLimit+"\n\n";
	}
	
	
}
