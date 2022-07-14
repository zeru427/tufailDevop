package com.oracle.springtraining.coupling1;

public class Client {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService("98877765");
		paymentService.pay(98000);
	}
}
