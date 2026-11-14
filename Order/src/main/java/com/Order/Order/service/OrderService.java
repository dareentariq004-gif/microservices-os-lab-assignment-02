package com.Order.Order.service;

import com.Order.Order.entity.OrderEntity;
import com.Order.Order.model.Menu;
import com.Order.Order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public OrderEntity saveOrder(OrderEntity order) {
        return orderRepository.save(order);
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public Menu[] getMenuItems() {
        return restTemplate.getForObject(
                "http://localhost:7775/menu",
                Menu[].class
        );
    }
}