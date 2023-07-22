package com.example.springmultipledbconnection2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrders {
    private int id;
    private int age;
    private String email;
    private String name;
    private int status;
    private String productName;
    private double price;
}
