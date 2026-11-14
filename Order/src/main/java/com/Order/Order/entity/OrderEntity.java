package com.Order.Order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private String itemName;

    private Integer quantity;

    private Double totalPrice;

    private String status;
}