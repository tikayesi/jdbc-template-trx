package com.enigma.jdbctemp.jdbctemp.service;

import com.enigma.jdbctemp.jdbctemp.model.Product;
import com.enigma.jdbctemp.jdbctemp.model.Transaction;
import org.springframework.transaction.annotation.Transactional;

public interface TransactionService {
    public Transaction getTrxById(Integer id);

    public void insertTransaction(Transaction transaction);
}
