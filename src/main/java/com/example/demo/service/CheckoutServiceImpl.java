package com.example.demo.service;

import com.example.demo.dao.CartItemRepository;
import com.example.demo.dao.CartRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Customer;
import com.example.demo.entity.StatusType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;



@Service
public class CheckoutServiceImpl implements CheckoutService{

    //private CustomerRepository customerRepository;
    private CartRepository cartRepository;
   // private CartItemRepository cartItemRepository;
    //@Autowired

    public CheckoutServiceImpl(CartRepository cartRepository) {
      //  this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
       // this.cartItemRepository = cartItemRepository;
    }




    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        System.out.println("Purchase response method working");
        Cart cart = purchase.getCart();

        //generate a tracking number for order
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setStatus(StatusType.ordered);
        System.out.println("Order tracking number");


        //populate order with cart items
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> cart.add(item));

        //populate customer with cart
        Customer customer = purchase.getCustomer();
      //  customer.add(cart);
        cart.setCustomer(customer);



        //save to the database
      //  customerRepository.save(customer);
        cartRepository.save(cart);


        //return a response
        return new PurchaseResponse(orderTrackingNumber);


    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();
    }
}
