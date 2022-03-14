package com.enigma.jdbctemp.jdbctemp.service;

import com.enigma.jdbctemp.jdbctemp.model.Product;

public interface ProductService {
    public Product getProductById(Integer id);
    public void insertProduct(Product product);
    public void updateProduct(Integer stock, Integer id);
}
