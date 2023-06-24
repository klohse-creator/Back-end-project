package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Division {

    private Long id;

    private String division_name;

    private Date create_date;

    private Date last_update;

    private Country country;

    private Long countryID;

    private Set<Customers> customers;






}
