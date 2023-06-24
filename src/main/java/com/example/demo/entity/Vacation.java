package com.example.demo.entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Data

public class Vacation {

    private Long id;

    private  String vacation_title;

    private String description;

    private BigDecimal travel_price;

    private String image_URL;

    private Date create_date;

    private Date last_update;

    private Set<Excursion> excursions;



}
