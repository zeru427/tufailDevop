package objectclassdemo;

import java.util.Arrays;
import java.util.TreeSet;

public class ProductClient {

    public static void main(String[] args) {
        Product product1 = new Product(1,"lakme",99,100);
        Product product2 = new Product(1,"lakme",99,100);
        Product product3 = product1;

        System.out.println(product1.equals(product2));

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

       /* System.out.println(product1.equals(product3));

        System.out.println("##Printing all the products :");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println("##Printing hashcode :");
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product3.hashCode());

        String str1="Tufail";
        String str2="Ahmed";

        System.out.println(str1.equals(str2));  //FALSE

        //checking the eqality of objects

        TreeSet s = new TreeSet();
        s.add("John");
        s.add("Daniel");
        s.add("Adam");

        System.out.println(s);*/
    }
}
