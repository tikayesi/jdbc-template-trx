package com.enigma.jdbctemp.jdbctemp.model;

public class Product {
    Integer id;
    String name;
    Integer price;
    Integer stock;
    Integer rating;

    public Product(Integer id, String name, Integer price, Integer stock, Integer rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.rating = rating;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
