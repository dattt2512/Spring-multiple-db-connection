package com.example.springmultipledbconnection2.dao.user;

import com.example.springmultipledbconnection2.model.user.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
