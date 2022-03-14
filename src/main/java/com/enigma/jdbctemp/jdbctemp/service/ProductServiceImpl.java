package com.enigma.jdbctemp.jdbctemp.service;

import com.enigma.jdbctemp.jdbctemp.dao.ProductDao;
import com.enigma.jdbctemp.jdbctemp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(Integer id){
      return   productDao.findProductById(id);
    }
    @Override
    public void insertProduct(Product product){
        productDao.insertProduct(product);
    }
    @Override
    public void updateProduct(Integer stock, Integer id){
        productDao.updateProduct(stock, id);
    }
}
