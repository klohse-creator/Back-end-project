package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data

public class Cart {

    private Long id;

    private String orderTrackingNumber;

    private BigDecimal package_price;

    private Integer party_size;

    private StatusType status;

    private Date create_date;

    private Date last_update;

    private Customer customer;

    privart Set<CartItem> cartItem;

}
