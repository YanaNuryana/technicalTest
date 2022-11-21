package com.example.technicaltest.service;

import com.example.technicaltest.dto.Purchase;
import com.example.technicaltest.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
