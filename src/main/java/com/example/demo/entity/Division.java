package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "DIVISIONS")
public class Division {

    @Column(name = "Division_ID")
    private Long id;

    @Column(name = "Division")
    private String division_name;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column(name = "Last_Update")
    private Date last_update;

    private Country country;

    @Column(name = "Country_ID")
    private Long countryID;

    private Set<Customer> customers;






}
