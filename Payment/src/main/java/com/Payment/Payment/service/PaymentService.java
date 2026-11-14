package com.Payment.Payment.service;

import com.Payment.Payment.entity.PaymentEntity;
import com.Payment.Payment.model.Order;
import com.Payment.Payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public PaymentEntity savePayment(PaymentEntity payment) {
        return paymentRepository.save(payment);
    }

    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Order[] getOrders() {
        return restTemplate.getForObject(
                "http://localhost:7776/orders",
                Order[].class
        );
    }
}