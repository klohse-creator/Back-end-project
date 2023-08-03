package com.example.demo.service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Customer;
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

        //generate a tracking number for order
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        //populate order with cartitems
       Set<CartItem> cartItems = purchase.getCartItems();
       cartItems.forEach(item -> cart.add(item));

       //populate customer with cart
       Customer customer = purchase.getCustomer();
       customer.add(cart);

       //save to the database
        customerRepository.save(customer);

        //return a response
        return new PurchaseResponse(orderTrackingNumber);
        //return enum type here too?
    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();
    }
}
