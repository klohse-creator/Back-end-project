package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name ="CARTS")

public class Cart {

    @Column(name = "Cart_ID")
    private Long id;

    @Column(name = "Order_Tracking_Number")
    private String orderTrackingNumber;

    @Column(name = "Package_Price")
    private BigDecimal package_price;

    @Column(name = "Party_Size")
    private int party_size;

    @Column(name = "Status")
    private StatusType status;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column(name = "Last_Update")
    private Date last_update;

    @Column(name = "Customer_ID")
    private Customer customer;

    private Set<CartItem> cartItem;

}
