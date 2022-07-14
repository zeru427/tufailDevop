package com.oracle.springtraining.coupling1.interfacesolutions;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService(getUserInput());
		paymentService.pay();
	}
	public static String getUserInput(){
		Scanner sc = new Scanner(System.in);
		String option=null;
		System.out.println("Please enter the account type(S/C/L/D) to process the payment");
		option = sc.next();
		return option;
	}
}
