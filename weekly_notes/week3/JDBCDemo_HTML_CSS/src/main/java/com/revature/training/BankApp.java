package com.revature.training;

public class BankApp {

    static BankApp app;
    //1. make the constructor as private
   private BankApp(){
        System.out.println("Bank App object created");;
    }
    //2. Create static method and return your class object
    public static BankApp getInstance(){
        if(app == null ){
            app = new BankApp();
        }
        return app;
    }
    public void withdraw(int amount)
    {
        System.out.println(amount + " debited successfully");
    }
}
