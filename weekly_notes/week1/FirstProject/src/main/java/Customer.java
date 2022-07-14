import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer
{
    public void displayCustomerDetails() {
        System.out.println("Displaying customer details");
    }

    public static void main(String[] args) {
      List data = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Hello hello = new Hello();
        hello.checkDetails();
    }
}