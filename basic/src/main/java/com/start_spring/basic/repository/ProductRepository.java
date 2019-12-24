package com.start_spring.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.start_spring.basic.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}