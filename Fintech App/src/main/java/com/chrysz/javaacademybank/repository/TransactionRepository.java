package com.chrysz.javaacademybank.repository;


import com.chrysz.javaacademybank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
