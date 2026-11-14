package com.Order.Order.controller;

import com.Order.Order.entity.OrderEntity;
import com.Order.Order.model.Menu;
import com.Order.Order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderEntity order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/menu")
    public Menu[] getMenus() {
        return orderService.getMenuItems();
    }
}