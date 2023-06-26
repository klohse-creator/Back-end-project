package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "EXCURSIONS")
public class Excursion {

    @Column(name = "Excursion_ID")
    private Long id;

    @Column(name = "Excursion_Title")
    private String excursion_title;

    @Column(name = "Excursion_Price")
    private BigDecimal excursion_price;

    @Column(name = "Image_URL")
    private String image_URL;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column(name = "Last_Update")
    private Date last_update;

    @Column(name = "Vacation_ID")
    private Vacation vacation;

    private Set<CartItem> cartitems;



}
