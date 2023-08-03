package com.example.demo.service;


import lombok.Data;
import lombok.NonNull;

@Data



public class PurchaseResponse {

    @NonNull
    private String orderTrackingNumber;
}
