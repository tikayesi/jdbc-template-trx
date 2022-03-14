package com.enigma.jdbctemp.jdbctemp.controller;

import com.enigma.jdbctemp.jdbctemp.model.Transaction;
import com.enigma.jdbctemp.jdbctemp.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    TransactionServiceImpl transactionService;

    @GetMapping("/transaction/{id}")
    public Transaction getTrxById(@PathVariable Integer id){
        return transactionService.getTrxById(id);
    }

    @PostMapping("/transaction")
    public void insertTransaction(@RequestBody Transaction transaction){
        transactionService.insertTransaction(transaction);
    }
}
