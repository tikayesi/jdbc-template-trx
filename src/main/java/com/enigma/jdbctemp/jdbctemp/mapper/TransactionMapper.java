package com.enigma.jdbctemp.jdbctemp.mapper;

import com.enigma.jdbctemp.jdbctemp.model.Transaction;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionMapper implements RowMapper<Transaction> {
    @Override
    public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {

        Transaction transaction = new Transaction();
        transaction.setId(rs.getInt("transaction_id"));
        transaction.setCustomerId(rs.getInt("customer_id"));
        transaction.setProductId(rs.getInt("product_id"));
        transaction.setDate(rs.getDate("trx_date"));
        transaction.setSubPrice(rs.getInt("sub_price"));
        transaction.setQty(rs.getInt("quantity"));
        return transaction;
    }
}
