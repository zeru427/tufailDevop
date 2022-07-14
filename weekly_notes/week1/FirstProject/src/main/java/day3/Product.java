package day3;

public class Product {
    private int productId;
    private String productName;
    private int quantityOnHand;
    private int price;

    public Product() {
        productId = -1;
        productName = "NotAvailable";
        quantityOnHand = -1;
        price = -1;
    }

    public Product(int productId, String productName, int quantityOnHand, int price) {
        this();
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public Product(int productId, String productName) {
        this();
        this.productId = productId;
        this.productName = productName;
    }

    public Product(int productId, String productName, int quantityOnHand) {
        this();
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
    }

    public Product(int productId, int quantityOnHand, int price) {
        this();
        this.productId = productId;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public void printProductDetails(){
        System.out.println("Product Id :" + getProductId());
        System.out.println("Product Name :" + getProductName());
        System.out.println("Product QOH :" + getQuantityOnHand());
        System.out.println("Product Price :" + getPrice());
    }
    public void calculateTax(){
        int price=99;
        System.out.println(price);          //99
        System.out.println(this.price);     //199
        //this keyword in java is used to refer to instance variable
        //when you have same name local variable as instance variable

    }
    //If the product price is $100, then the price should reflect as $120

    public Product changeProductData(){
            int originalPrice = this.getPrice();
            int modifiedPrice = (int) (originalPrice * .20);  //we are incresing the price of a product
        System.out.println("Modified price :"+modifiedPrice);
                 this.setPrice(modifiedPrice);
            return this;
    }
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

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
