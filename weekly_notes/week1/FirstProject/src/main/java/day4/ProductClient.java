package day4;

class Apple {
    @Override
    public String toString() {
        return "Hello";
    }
}

public class ProductClient {

    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a);
        System.out.println(a.toString());

        Product product1 = new Product(12, "Mobile", 98, 98);
        System.out.println(product1);

        //equals and hashcode
        Product product2 = new Product(12, "Mobile", 98, 98);

        Product product3 = product1;
                                    //object                                                 //should        //actual output
        System.out.println(product1.equals(product2));      //? T                F
        System.out.println(product1.equals(product3));      //? T                T

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product3.hashCode());
    }
}
