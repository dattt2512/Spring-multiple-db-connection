package com.example.springmultipledbconnection2.service;

import com.example.springmultipledbconnection2.dto.UserOrders;

import java.util.List;

public interface UserOrdersService {

    List<UserOrders> findOrderByUserId(int id);
}
