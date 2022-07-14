package com.oracle.springtraining.coupling1;

public class CurrentAccount {

	private String accountNumber;
	public CurrentAccount(String accountNUmber) {
		this.accountNumber = accountNUmber;
	}
	public String getDetails(){
		return accountNumber;
	}
}
