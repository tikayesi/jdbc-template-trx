package com.enigma.jdbctemp.jdbctemp.dao;

import com.enigma.jdbctemp.jdbctemp.mapper.TransactionMapper;
import com.enigma.jdbctemp.jdbctemp.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDaoImpl implements TransactionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Transaction getTransactionById(Integer id) {
        String sql = "SELECT * FROM transaction WHERE transaction_id = ?";
        Transaction transaction = jdbcTemplate.queryForObject(sql, new TransactionMapper(), id);
        return transaction;
    }

    @Override
    public void insertTransaction(Transaction transaction) {
        String sql = "INSERT INTO transaction (transaction_id, customer_id, product_id, trx_date, " +
                "sub_price, quantity) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, transaction.getCustomerId(), transaction.getCustomerId()
        , transaction.getProductId(), transaction.getDate(), transaction.getSubPrice(), transaction.getQty());
    }
}
