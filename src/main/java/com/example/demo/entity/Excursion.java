package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data

public class Excursion {

    private Long id;

    private String excursion_title;

    private BigDecimal excursion_price;

    private String image_URL;

    private Date create_date;

    private Date last_update;

    private Vacation vacation;

    private Set<CartItem> cartitems;



}
