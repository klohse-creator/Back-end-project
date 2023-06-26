package com.example.demo.entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "VACATIONS")
public class Vacation {

    @Column(name = "Vacation_ID")
    private Long id;

    @Column(name = "Vacation_Title")
    private  String vacation_title;

    @Column(name = "Description")
    private String description;

    @Column(name = "Travel_Fare_Price")
    private BigDecimal travel_price;

    @Column(name = "Image_URL")
    private String image_URL;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column(name = "Last_Update")
    private Date last_update;

    private Set<Excursion> excursions;



}
