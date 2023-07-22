package com.example.springmultipledbconnection2.dao.product;

import com.example.springmultipledbconnection2.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
