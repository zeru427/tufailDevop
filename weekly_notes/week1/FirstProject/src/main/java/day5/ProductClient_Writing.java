package day5;

import java.io.*;

public class ProductClient_Writing {

    public static void main(String[] args) throws IOException {
        Product product = new Product();
        product.acceptProductDetails();

        System.out.println(product);
        //save the object

        ObjectOutputStream outputStream =
                new ObjectOutputStream(new BufferedOutputStream
                        (new FileOutputStream("h:\\rec.txt")));

        outputStream.writeObject(product);

        outputStream.close();
        System.out.println("Successfully saved the product data to file");
    }

}
