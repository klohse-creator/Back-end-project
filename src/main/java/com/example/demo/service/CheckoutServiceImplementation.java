package com.example.demo.service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImplementation implements CheckoutService{

    private CustomerRepository customerRepository;


    public CheckoutServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Cart cart = purchase.getCart();

        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

       Set<CartItem> cartItems = purchase.getCartItems();
       cartItems.forEach(item -> cart.add(item));



        return null;
    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();
    }
}
