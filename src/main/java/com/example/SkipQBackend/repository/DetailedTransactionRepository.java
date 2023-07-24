package com.example.SkipQBackend.repository;

/*
 JPA repository that connects to the detailed_transaction table in mysql
*/

import com.example.SkipQBackend.entity.DetailedTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetailedTransactionRepository extends JpaRepository<DetailedTransaction, Integer> {
    //Custom SQL query to get all transaction with a particular id
    @Query(value = "select * from detailed_transaction where transaction_id = ?1",
            nativeQuery = true)
    List<DetailedTransaction> findAllByTransactionId(int transactionId);
}
