package day2;

public class Product {

    int productId;
    String productName;
    int quantityOnHand;
    int price;

    static int noOfObjects;

    {
        productId = -1;
        productName = "NA";
        quantityOnHand = -1;
        price = -1;
        noOfObjects++;
    }

    static {
        System.out.println("####WELCOME TO MY FIRST PRODUCT APP");
    }

    public Product() {
        productId = 100;
        productName = "Lakme";
        quantityOnHand = 100;
        price = 90;
    }

    public Product(int productId, String productName, int quantityOnHand, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public int calculatePrice(Product product) {
        //create local variable total
        int sum = 0;
        sum = product.quantityOnHand * product.price;
        return sum;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(201, "Aroma", 900, 899);
        Product product3 = new Product(202, "Pendrive", 877, 99);

        int sum=0;
        sum = product1.calculatePrice(product1);
        System.out.println(product1.productName+ " bill is :"+sum);

        sum = product2.calculatePrice(product2);
        System.out.println(product2.productName+ " bill is :"+sum);

        sum = product3.calculatePrice(product3);
        System.out.println(product3.productName+ " bill is :"+sum);

        System.out.println("Total products :"+noOfObjects);
    }
}
