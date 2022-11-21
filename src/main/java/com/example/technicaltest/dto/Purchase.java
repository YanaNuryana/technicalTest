package com.example.technicaltest.dto;

import com.example.technicaltest.entity.Address;
import com.example.technicaltest.entity.Customer;
import com.example.technicaltest.entity.Order;
import com.example.technicaltest.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}