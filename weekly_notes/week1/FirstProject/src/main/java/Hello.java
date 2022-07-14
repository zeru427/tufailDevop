import hr.*;

public class Hello {
    public void checkDetails(){
        System.out.println("3.Checking the details of the attendees");

    }
    public void displayDetails(){
        System.out.println("2.Thanks for attending the session");
        Hello hello = new Hello();
        hello.checkDetails();

    }
        public static void main(String args[]){
            System.out.println("1. Our first program");
            Hello hello = new Hello();
            hello.displayDetails();
            System.out.println("4. Hello and welcome to Revature");
            Customer customer = new Customer();
            customer.displayCustomerDetails();
           Salary salary = new Salary();
            salary.calculateSalary();
            Tax tax = new Tax();
            tax.calculateTax();
        }
}

class Demo1
{
        int age=90;
     public void display(){
            age=99;
    }
}
class Demo2
{
        public void display(){
            //NO
          int  age=88;
            Demo1 d = new Demo1();
            d.age = 887;
        }
}
class Demo3 extends Demo1
{
    public void display(){
        age=88;
        Demo1 d = new Demo1();
        d.age = 887;
    }
}