package com.example.springmultipledbconnection2;

import com.example.springmultipledbconnection2.service.UserOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserOrderController {

    @Autowired
    private UserOrdersService userOrdersService;

    @PostMapping("/order/{id}")
    public ResponseEntity findOrderByUserId(@PathVariable("id") int id) {
        return ResponseEntity.ok().body(userOrdersService.findOrderByUserId(id));
    }
}
