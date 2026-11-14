package com.Delivery.Delivery.service;

import com.Delivery.Delivery.entity.Delivery;
import com.Delivery.Delivery.model.Payment;
import com.Delivery.Delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Delivery saveDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Payment[] getPayments() {
        return restTemplate.getForObject(
                "http://localhost:7774/payments",
                Payment[].class
        );
    }
}