package day3;

public class Client {

    public static void main(String[] args) {
        Product product1 =
                new Product(98, "Mobile", 88, 90);
        product1.printProductDetails();

       Product product2 = product1.changeProductData();
        System.out.println("After changing the price : ");
       product1.printProductDetails();
    }
}
