package com.example.demo.service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Customer;
import com.example.demo.entity.StatusType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
@Getter
@Setter
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }




    @Override
    @Transactional
    public PurchaseResponse placeOrder(PurchaseData purchaseData) {

        Cart cart = purchaseData.getCart();

        //generate a tracking number for order
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setStatus(StatusType.ORDERED);


        //populate order with cart items
       Set<CartItem> cartItems = purchaseData.getCartItems();
       cartItems.forEach(item -> cart.add(item));

       if (cartItems == null) {
           System.out.println("Cart is empty.");
       }

       //populate customer with cart
       Customer customer = purchaseData.getCustomer();
       customer.add(cart);

       if (customer == null) {
           System.out.println("Customer information is invalid.");
       }

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
