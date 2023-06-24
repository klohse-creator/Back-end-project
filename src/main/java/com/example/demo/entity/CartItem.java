package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data

public class CartItem {

    private Long id;

    private Vacation vacation;

    private Set<Excursion> excursions;

    private Cart cart;

    private Date create_date;

    private Date last_update;

}
