package com.training.revature.dao;

import com.training.revature.model.Product;
import com.training.revature.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    final static private String INSERT_PRODUCT_QUERY = "insert into public.product values ( ?,?,?,?)";
    final static private String UPDATE_PRODUCT_QUERY = "update public.product set productname = ?, qoh = ?, price = ? where productid = ?";
    final static private String DELETE_PRODUCT_QUERY = "delete from public.product where productid = ?";
    final static private String GET_PRODUCT_QUERY_BY_ID = "select * from public.product where productid = ?";
    final static private String GET_PRODUCT_QUERY_BY_PRODUCTNAME = "select * from public.product where productname = ?";
    final static private String GET_PRODUCT_QUERY = "select * from public.product";
    final static private String UPDATE_QOH_QUERY = "update public.product set qoh = qoh + ? where productid = ?";
    //Enter product id : 6
    //Enter product discount : 25
    //price = price + (price/100*25);
    final static private String UPDATE_PRICE_QUERY = "update public.product set price = price - (price/100* ? ) where productid = ?";

    Connection connection = DBConnection.getConnection();

    @Override
    public boolean addProduct(Product product) {
        PreparedStatement statement = null;
        int res = 0;
        try {
            statement = connection.prepareStatement(INSERT_PRODUCT_QUERY);
            statement.setInt(1, product.getProductId());
            statement.setString(2, product.getProductName());
            statement.setInt(3, product.getQoh());
            statement.setInt(4, product.getPrice());

            //4. executing the statement and returning the result
            res = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (res == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean deleteProduct(int productId) {
        PreparedStatement statement = null;
        int res = 0;
        try {
            statement = connection.prepareStatement(DELETE_PRODUCT_QUERY);
            statement.setInt(1, productId);
            //4. executing the statement and returning the result
            res = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (res == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean updateProduct(Product product) {
        PreparedStatement statement = null;
        int res = 0;
        try {
            //update public.product set productname = ?, qoh = ?, price = ? where productid = ?";
            statement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);
            statement.setInt(4, product.getProductId());
            statement.setString(1, product.getProductName());
            statement.setInt(2, product.getQoh());
            statement.setInt(3, product.getPrice());

            //4. executing the statement and returning the result
            res = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (res == 0) {
            return false;
        } else {
            return true;
        }
    }

    //this method will return a single product by id
    public Product getProduct(int productId) {
        PreparedStatement statement = null;
        ResultSet res = null;
        Product p = new Product();
        try {
            statement = connection.prepareStatement(GET_PRODUCT_QUERY_BY_ID);
            statement.setInt(1, productId);

            //4. executing the statement and returning the result
            res = statement.executeQuery();
            res.next();
            p.setProductId(res.getInt(1)); //we are getting productid from db and setting in product obj
            p.setProductName(res.getString(2)); //we are getting productid from db and setting in product obj
            p.setQoh(res.getInt(3)); //we are getting productid from db and setting in product obj
            p.setPrice(res.getInt(4)); //we are getting productid from db and setting in product obj

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return p;
    }


    @Override
    public boolean isProductExists(int productId) {
        PreparedStatement statement = null;
        ResultSet res = null;
        try {
            statement = connection.prepareStatement(GET_PRODUCT_QUERY_BY_ID);
            statement.setInt(1,productId);

            res = statement.executeQuery();
            if(res.next()==false) return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }


    @Override
    public int updateStock(int productId, int addQoh) {
        PreparedStatement statement = null;
        int res=0;
        try {
            // update public.product set qoh = qoh + ? where productid = ?
            // statement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);
            statement.setInt(1, addQoh);
            statement.setInt(2,productId);
            //4. executing the statement and returning the result
            res = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if(res==0){
            return -1;
        }
        else {
            return res;
        }
    }


    @Override
    public int updatePrice(int productId, int discount) {
        PreparedStatement statement = null;
        int res = 0;
        try {
            //update public.product set price = price - (price/100* ? ) where productid = ?
            statement = connection.prepareStatement(UPDATE_PRICE_QUERY);
            statement.setInt(2, productId);
            statement.setInt(1, discount);
            res = statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (res == 0) {
            return 0;

        } else {
            return res;
        }
    }

    @Override
    public List<Product> getProduct(String productName) {
        PreparedStatement statement = null;
        ResultSet res = null;
        List<Product> products= new ArrayList<Product>();
        try {
            statement = connection.prepareStatement(GET_PRODUCT_QUERY_BY_ID);
            statement.setString(1, productName);

            //4. executing the statement and returning the result
            res = statement.executeQuery();

            while(res.next()) {
                Product product = new Product();
                product.setProductId(res.getInt(1)); //we are getting productid from db and setting in product obj
                product.setProductName(res.getString(2)); //we are getting productid from db and setting in product obj
                product.setQoh(res.getInt(3)); //we are getting productid from db and setting in product obj
                product.setPrice(res.getInt(4)); //we are getting productid from db and setting in product obj

                //adding product one by one in an arraylist
                products.add(product);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public List<Product> getProducts() {
        PreparedStatement statement = null;
        ResultSet res = null;
        List<Product> products= new ArrayList<Product>();
        try {
            statement = connection.prepareStatement(GET_PRODUCT_QUERY);
            //4. executing the statement and returning the result
            res = statement.executeQuery();
            while(res.next()) {
                Product product = new Product();
                product.setProductId(res.getInt(1)); //we are getting productid from db and setting in product obj
                product.setProductName(res.getString(2)); //we are getting productid from db and setting in product obj
                product.setQoh(res.getInt(3)); //we are getting productid from db and setting in product obj
                product.setPrice(res.getInt(4)); //we are getting productid from db and setting in product obj

                //adding product one by one in an arraylist
                products.add(product);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }


}
