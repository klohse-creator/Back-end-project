package com.example.demo.service;

import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class PurchaseResponse {

    private String orderTrackingNumber;
}
