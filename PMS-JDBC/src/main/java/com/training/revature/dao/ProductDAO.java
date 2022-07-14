package com.training.revature.dao;

import com.training.revature.model.Product;

import java.util.List;

public interface ProductDAO {
        public boolean addProduct(Product product);
        public boolean deleteProduct(int productId);
        public boolean updateProduct(Product product);
        public Product getProduct(int productId);
        public boolean isProductExists(int productId);
        public List<Product> getProduct(String productName);
        public List<Product> getProducts();
        public int updateStock(int productId, int addQoh);


        public int updatePrice(int productId, int discount);

}
