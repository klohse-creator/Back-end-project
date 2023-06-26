package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "CART_ITEMS")

public class CartItem {

    @Column(name = "Cart_Item_ID")
    private Long id;

    @Column(name = "Vacation ID")
    private Vacation vacation;

    private Set<Excursion> excursions;

    @Column(name = "Cart_ID")
    private Cart cart;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column (name = "Last_Update")
    private Date last_update;

}
