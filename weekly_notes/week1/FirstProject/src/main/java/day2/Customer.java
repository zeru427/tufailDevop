package day2;

public class Customer
{
	String customerName="Ananda";
	//default constructor
	public Customer(){
		System.out.println("Customer cons called");
		customerName="Daniel";
	}
	//paramaterized cons	// constructor overloading
	public Customer(String cName){
		System.out.println("Customer param cons called");
		customerName=cName;
	}
	//method overloading - is a technique by which we can have same method name but different signatures
	public void print(String message){
		System.out.println(message);
	}
	public void print(String message,String location){
		System.out.println(message + " and your location is :"+location);
	}
	public void print()  {
		System.out.println("Mohammad Tufail Ahmed -  Trainer");
	}
	public static void main(String args[]){
		Customer cust1 = new Customer("Chris");
		System.out.println(cust1.customerName);
		Customer cust2 = new Customer();
		System.out.println(cust2.customerName);

		cust1.print();
		cust1.print("Hi How r u");
		cust1.print("Welcome to Revature","US");
		cust1.print("Thanks for attending the session");
		cust1.print("test demo","IN");

	}

}
