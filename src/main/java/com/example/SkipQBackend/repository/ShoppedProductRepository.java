package com.example.SkipQBackend.repository;

/*
 JPA repository that connects to the shopped_transaction table in mysql
*/

import com.example.SkipQBackend.entity.ShoppedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppedProductRepository extends JpaRepository<ShoppedProduct, Long> {
}
