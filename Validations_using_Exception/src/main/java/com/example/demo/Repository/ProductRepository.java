package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Product1;

@Repository
public interface ProductRepository extends JpaRepository<Product1, Long> {

}
