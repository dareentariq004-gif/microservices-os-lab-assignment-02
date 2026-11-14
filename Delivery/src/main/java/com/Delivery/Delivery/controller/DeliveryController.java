package com.Delivery.Delivery.controller;

import com.Delivery.Delivery.entity.Delivery;
import com.Delivery.Delivery.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Delivery.Delivery.model.Payment;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/add")
    public Delivery addDelivery(@RequestBody Delivery delivery) {
        return deliveryService.saveDelivery(delivery);
    }

    @GetMapping
    public List<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }
    @GetMapping("/payments")
    public Payment[] getPayments() {
        return deliveryService.getPayments();
    }
}