package com.example.SkipQBackend.repository;

/*
 JPA repository that connects to the discount_item table in mysql
*/

import com.example.SkipQBackend.entity.DiscountItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountItemRepository extends JpaRepository<DiscountItem,Long> {
}
