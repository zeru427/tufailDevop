package day5;

import java.io.*;

public class ProductClient_Reading {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product = new Product();

        ObjectInputStream inputStream =
                new ObjectInputStream(new BufferedInputStream
                        (new FileInputStream("h:\\rec.txt")));

        product = (Product) inputStream.readObject();

        System.out.println(product);
        //save the object
        inputStream.close();
        System.out.println("Displayedthe product data from file");
    }

}
