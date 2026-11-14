package com.Payment.Payment.controller;

import com.Payment.Payment.entity.PaymentEntity;
import com.Payment.Payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Payment.Payment.model.Order;

import java.util.List;

@RestController
@RequestMapping("/payments")

public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public PaymentEntity createPayment(@RequestBody PaymentEntity payment) {
        return paymentService.savePayment(payment);
    }

    @GetMapping
    public List<PaymentEntity> getAllPayments() {
        return paymentService.getAllPayments();
    }
    @GetMapping("/orders")
    public Order[] getOrders() {
        return paymentService.getOrders();
    }
}