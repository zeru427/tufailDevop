package com.oracle.springtraining.coupling1.interfacesolutions;

public class DematAccount implements Account{

	private String accountNumber;
	private String dailyLimit;
	public String getAccountNumber() {
		return accountNumber;
	}


	public DematAccount(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}


	@Override
	public String getDetails() {
		System.out.println("Demat Account getDetails() called");
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(String dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
	
}
