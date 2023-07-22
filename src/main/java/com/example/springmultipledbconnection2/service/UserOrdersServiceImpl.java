package com.example.springmultipledbconnection2.service;

import com.example.springmultipledbconnection2.dao.user.UserRepository;
import com.example.springmultipledbconnection2.dto.UserOrders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserOrdersServiceImpl implements UserOrdersService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserOrders> findOrderByUserId(int id) {
        try {
            return userRepository.findOrderByUserId(id);
        } catch (Exception e) {
            log.error("Can not find any order with user id: {}", id);
            return null;
        }
    }
}
