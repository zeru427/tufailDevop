package day3;


public class ThisConsChainingDemo {

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(122,"Lakme",100,30);

        System.out.println("###Print product1 details");
        product1.printProductDetails();
        System.out.println("###Print product2 details");
        product2.printProductDetails();

        Product product3 = new Product(123,"Pendrive");

        System.out.println("###Print product3 details");
        product3.printProductDetails();     //price and qoh ??

        Product product4 = new Product(124,99,100);

        System.out.println("###Print product4 details");
        product4.printProductDetails();     //productName ??

    }
}
