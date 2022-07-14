package com.training.revature.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
//cons - default and parametrized
    //getter and setter
    //equals and hashcode
    //toString
    private int productId;
    private String productName;
    private int qoh;
    private int price;

    //default cons

    public Product() {
    }

    //parametrized cons
    public Product(int productId, String productName, int qoh, int price) {
        this.productId = productId;
        this.productName = productName;
        this.qoh = qoh;
        this.price = price;
    }

    //setters and getters for all
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && qoh == product.qoh && price == product.price && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, qoh, price);
    }

    //to string

    @Override
    public String toString() {
        return "\nProduct{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", qoh=" + qoh +
                ", price=" + price +
                '}';
    }
}
