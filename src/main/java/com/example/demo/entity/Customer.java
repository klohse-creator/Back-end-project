package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;


@Entity
@Data
@Table(name = "CUSTOMERS")
public class Customer {

    @Column(name = "Customer_ID")
    private Long id;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Address")
    private String address;

    @Column(name = "Postal_Code")
    private String postal_code;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Create_Date")
    private Date create_date;

    @Column(name = "Last_Update")
    private Date last_update;

    @Column(name = "Division_ID")
    private Division division;

    private Set<Cart> carts;







}
