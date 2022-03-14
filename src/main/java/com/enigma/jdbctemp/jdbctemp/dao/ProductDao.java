package com.enigma.jdbctemp.jdbctemp.dao;

import com.enigma.jdbctemp.jdbctemp.model.Product;

import java.util.List;

public interface ProductDao {
    public Product findProductById(Integer id);
    public void insertProduct(Product product);
    public void updateProduct(Integer stock, Integer id);
    public List<Product> getAllProduct();
}
