package com.revature.training;

public class BankClient {

    public static void main(String[] args) {
        BankApp app1 = BankApp.getInstance();
        app1.withdraw(5000);
        BankApp app2 = BankApp.getInstance();
        app2.withdraw(8000);
        BankApp app3 = BankApp.getInstance();
        app3.withdraw(8000);
    }
}
