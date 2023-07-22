package com.example.springmultipledbconnection2.dao.user;

import com.example.springmultipledbconnection2.dto.UserOrders;
import com.example.springmultipledbconnection2.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Transactional(timeout = 300)
    @Query(nativeQuery = true)
    List<UserOrders> findOrderByUserId(int id);
}
