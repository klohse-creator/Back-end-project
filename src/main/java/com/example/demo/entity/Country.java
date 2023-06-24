package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data

public class Country {

    private Long id;

    private String country_name;

    private Date create_date;

    private Date last_update;

    private Set<Division> divisions;

}
