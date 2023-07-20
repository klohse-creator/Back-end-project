package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "cart_items")

public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @Column(name = "vacation id")
    private Vacation vacation;

    private Set<Excursion> excursions;

    @Column(name = "cart_id")
    private Cart cart;

    @Column(name = "create_date")
    private Date create_date;

    @Column (name = "last_update")
    private Date last_update;

}
