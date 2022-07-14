package com.training.revature.client;

import com.training.revature.dao.ProductDAO;
import com.training.revature.dao.ProductDAOImpl;
import com.training.revature.model.Product;

import java.util.Scanner;

public class ProductApp {
    public void startProductApp(){
        int choice =0;
        boolean result = false;
        ProductDAO productDAO = new ProductDAOImpl();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("M E N U ");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Find Product By Id");
            System.out.println("5. Find Product By Name");
            System.out.println("6. Find all Products");
            System.out.println("7. Update Stock");
            System.out.println("8. Update Price");
            System.out.println("9. E X I T");

            System.out.println("Please enter your choice :");
            choice = scanner.nextInt() ;

            switch(choice) {

                case 1 :
                    System.out.println("Welcome to product add section : ");
                    System.out.println("Please enter product id "); int productId = scanner.nextInt();

                    if(productDAO.isProductExists(productId)){
                        System.out.println("Product with product id :"+productId+ " already exists, please try with other productid");
                    }
                    else {
                        System.out.println("Please enter product name ");
                        String productName = scanner.next();
                        System.out.println("Please enter product price ");
                        int price = scanner.nextInt();
                        System.out.println("Please enter product qoh ");
                        int qoh = scanner.nextInt();

                        Product product = new Product(productId, productName, qoh, price);
                        result = productDAO.addProduct(product);
                        if (result)
                            System.out.println("Product Saved successfully");
                        else
                            System.out.println("SOme problem occurred. product not saved");
                    }
                    break;
                case 2:
                    System.out.println("Welcome to product update section : ");
                    System.out.println("Please enter productid");
                     productId = scanner.nextInt();
                    if(productDAO.isProductExists(productId))
                    {
                        System.out.println("Please enter product name");
                        String productName = scanner.next();
                        System.out.println("Please enter product price ");
                        int price = scanner.nextInt();
                        System.out.println("Please enter product qoh ");
                        int qoh = scanner.nextInt();
                        Product product = new Product(productId, productName, qoh, price);
                        result = productDAO.updateProduct(product);
                        if (result)
                            System.out.println("Product updated successfully");
                        else
                            System.out.println("SOme problem occurred. product not saved");
                    }
                    else {
                        System.out.println("Cannot proceed with the update , because product id does not exists");
                    }

                    break;
                case 3: //Delete
                    System.out.println("Welcome to product delete section : ");
                    System.out.println("Please enter product id ");
                    productId = scanner.nextInt();

                    if(!productDAO.isProductExists(productId)){
                        System.out.println("Product with product id :"+productId+ " does not exist, please try with other productid");
                    }
                    else {
                        result = productDAO.deleteProduct(productId);
                        if (result)
                            System.out.println("Product Deleted successfully");
                        else
                            System.out.println("Some problem occurred. product not deleted");
                    }
                    break;
                case 4:
                    System.out.println("Welcome to product display by id section: ");
                    System.out.println("Enter the productId you want to find: ");
                    productId = scanner.nextInt();
                    if(productDAO.isProductExists(productId)){
                        System.out.println(productDAO.getProduct(productId).toString());
                    }
                    else {
                        System.out.println("Product does not exist");
                    }
                    break;
                case 6:
                    System.out.println("Welcome to product display section : ");
                    System.out.println(productDAO.getProducts());
                    break;
                case 9:
                    System.out.println("Thanks for using my product app");
                    System.exit(0);
            }
        }
    }
}
