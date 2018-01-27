package com.moneymoney.entity;

import com.moneymoney.account.BankAccount;

public class Customer {
	private int customerID;
	private String customerName;
	private BankAccount bankAccount;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", bankAccount=" + bankAccount
				+ "]";
	}
	
	
}
