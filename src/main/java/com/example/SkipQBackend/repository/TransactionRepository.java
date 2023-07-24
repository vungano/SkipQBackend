package com.example.SkipQBackend.repository;

/*
 JPA repository that connects to the transaction table in mysql
*/

import com.example.SkipQBackend.entity.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Modifying
    @Transactional
    @Query(value = "update transaction set transaction_verified = TRUE where transaction_id = ?1",
    nativeQuery = true)
    int setTransactionStatus(int transactionId);
}
