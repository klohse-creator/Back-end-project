package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "COUNTRIES")
public class Country {

    @Column(name = "Country_ID")
    private Long id;

    @Column(name = "Country")
    private String country_name;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column(name = "Last_Update")
    private Date last_update;

    private Set<Division> divisions;

}
