package com.example.demo.service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {

    private Customer customer;

    private Cart cart;

    private Set<CartItem> cartItems;
}
