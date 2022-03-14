package com.enigma.jdbctemp.jdbctemp.controller;

import com.enigma.jdbctemp.jdbctemp.model.Product;
import com.enigma.jdbctemp.jdbctemp.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productDao;

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable Integer id){
       return productDao.getProductById(id);
    }
}
