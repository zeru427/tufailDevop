/*
package com.oracle.springtraining.springbeanfactoryannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {
	@Autowired
	private SavingsAccount savingsAccount;
	
	public Payment() {
	}
	public void pay(){
	
		System.out.println("Payment using constructor injecting ->"+ this.savingsAccount.getDetails());
	}
	
	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
}
*/
