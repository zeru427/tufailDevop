package day3;

public class ArrayOfObjects {

    public static void main(String[] args) {

        Product product1 = new Product();
        //array of objects
        Product products[] = new Product[5];
        for(int i=0;i<products.length;i++)
        {
            products[i] = new Product();
        }
        //total 6 objects
        product1.setProductName("Lakme");
        products[4].setProductName("Aroma");

        System.out.println("Product 1 name is :"+product1.getProductName());
        System.out.println("Product array 0 index name is :"+products[4].getProductName());

    }
}
