package com.moneymoney.account;

import com.moneymoney.entity.Customer;

public class SavingsAccount extends BankAccount {

	private boolean salary;

	public SavingsAccount(Customer customer, double accountBalance, boolean salary) {
		super(customer, accountBalance);
		this.salary = salary;
	}

	public SavingsAccount(Customer customer, boolean salary) {
		super(customer);
		this.salary = salary;
	}

	public boolean isSalary() {
		return salary;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString()+"salary=" + salary + "\n\n" ;
	}	
}
