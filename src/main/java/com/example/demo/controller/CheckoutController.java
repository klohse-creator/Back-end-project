package com.example.demo.controller;

import com.example.demo.service.CheckoutService;
import com.example.demo.service.PurchaseData;
import com.example.demo.service.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")

public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }


    @PostMapping("/purchaseData")
    public PurchaseResponse placeOrder(@RequestBody PurchaseData purchaseData) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchaseData);

        return purchaseResponse;

    }
}
