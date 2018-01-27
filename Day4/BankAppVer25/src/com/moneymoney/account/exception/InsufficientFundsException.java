package com.moneymoney.account.exception;

//Custom Exception
public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}
