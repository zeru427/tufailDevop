package com.revature.pms.controller;

import com.revature.pms.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping()     //localhost:8084/product
    public String home() {
        return "Welcome to Product App";
    }

    @GetMapping("{pId}")     //localhost:8084/product/78
    public Product getProduct(@PathVariable("pId") int productId) {
        System.out.println("Fetching details about by product id  :" + productId);
        //call the methods to fetch product details of this product id
        Product product = new Product(productId, "Dummy", 99, 100);
        return product;
    }

    @GetMapping("/searchProductByName/{pName}")     //localhost:8084/product/searchProductByName/Laptop
    public Product getProductByName(@PathVariable("pName") String productName) {
        System.out.println("Fetching details about product name  :" + productName);
        //call the methods to fetch product details of this productname
        Product product = new Product(-1, productName, 99, 100);
        return product;
    }

    //localhost:8084/product/filterProductByPrice/100/and/500
    //Here is the result for product in the price range of 100 and 500

    @GetMapping("/filterProductByPrice/{lowerPrice}/and/{upperPrice}")
    public String filterProductByPrice(@PathVariable("lowerPrice") int lowerPrice, @PathVariable("upperPrice") int upperPrice) {
        //call the methods to fetch product details of this productname
        return "Here is the result tt for product in the price range of " + lowerPrice + " and " + upperPrice;
    }

    //localhost:8084/product/outOfStockProductDetails/350

    //Output : Order with qoh less than 50 should be reordered immediality
    //Output : Order with qoh less than 350 should be reordered immediality
    @GetMapping("/outOfStockProductDetails/{pMinStock}")
    public String getOutOfStockProductDetails(@PathVariable("pMinStock") int productMinStock) {
        return "Order with qoh less than " + productMinStock + " should be reordered immediately..";
    }


    /*
    Deleting a single product by id
     */
    @DeleteMapping("{pId}")     //localhost:8084/product/78                        -HTTP method - DELETE
    public String deleteProduct(@PathVariable("pId") int productId) {
        System.out.println("Deleting details  by product id  :" + productId);
        //call the methods to delete product details of this product id
        return "Deleting details  by product id  :" + productId;
    }
}
