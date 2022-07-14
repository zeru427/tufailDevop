package com.oracle.springtraining.coupling1;

public class PaymentService {
	
	private SavingsAccount savingsAccount;
	private CurrentAccount currentAccount;
	
	public PaymentService(String accountNumber) {
		savingsAccount = new SavingsAccount(accountNumber);
	}
	public void pay(int amount){
	
		System.out.println("Doing the Payment of :"+amount+ " using tight coupling ->"+ this.savingsAccount.getDetails());
	}
}
