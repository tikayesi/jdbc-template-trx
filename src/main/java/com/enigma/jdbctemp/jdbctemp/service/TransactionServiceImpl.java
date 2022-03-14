package com.enigma.jdbctemp.jdbctemp.service;

import com.enigma.jdbctemp.jdbctemp.dao.TransactionDao;
import com.enigma.jdbctemp.jdbctemp.model.Product;
import com.enigma.jdbctemp.jdbctemp.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TransactionDao transactionDao;

    @Autowired
    ProductServiceImpl productServiceImpl;

    @Override
    public Transaction getTrxById(Integer id){
        return  transactionDao.getTransactionById(id);
    }

    @Transactional
    @Override
    public void insertTransaction(Transaction transaction){
        Product product = productServiceImpl.getProductById(transaction.getProductId());
        transaction.setSubPrice(product.getPrice() * transaction.getQty());
        productServiceImpl.updateProduct(product.getStock() - transaction.getQty(), transaction.getProductId());
        transactionDao.insertTransaction(transaction);
    }

}
