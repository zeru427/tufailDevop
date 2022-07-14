package objectclassdemo;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private int quantityOnHand;
    private int price;

    public Product() {
    }

    public Product(int productId, String productName, int quantityOnHand, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && quantityOnHand == product.quantityOnHand && price == product.price && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, quantityOnHand, price);
    }
}
