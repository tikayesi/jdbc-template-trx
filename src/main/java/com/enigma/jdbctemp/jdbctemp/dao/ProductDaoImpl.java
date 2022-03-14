package com.enigma.jdbctemp.jdbctemp.dao;

import com.enigma.jdbctemp.jdbctemp.mapper.ProductRowMapper;
import com.enigma.jdbctemp.jdbctemp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Product findProductById(Integer id) {
        String sql = "SELECT * FROM product WHERE product_id = ?";
        Product product = jdbcTemplate.queryForObject(sql, new ProductRowMapper(), id);
        return product;
    }

    @Override
    public void insertProduct(Product product) {
        String sql = "INSERT INTO product (product_id, name, price, stock, rating)" +
                "VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, product.getId(), product.getName(), product.getPrice(),
                product.getStock(), product.getRating());
    }

    @Override
    public void updateProduct(Integer stock, Integer id) {
        String sql = "UPDATE product SET stock = ? WHERE product_id = ?";
        jdbcTemplate.update(sql, stock, id);
    }

    @Override
    public List<Product> getAllProduct() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }

}
