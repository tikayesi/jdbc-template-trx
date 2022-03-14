package com.enigma.jdbctemp.jdbctemp.dao;

import com.enigma.jdbctemp.jdbctemp.model.Transaction;

public interface TransactionDao {
    public Transaction getTransactionById(Integer id);
    public void insertTransaction(Transaction transaction);
}
