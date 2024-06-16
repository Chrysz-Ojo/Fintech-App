package com.chrysz.javaacademybank.service;


import com.chrysz.javaacademybank.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
