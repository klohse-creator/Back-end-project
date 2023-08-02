package com.example.demo.service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Customer;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


import java.util.Set;


@Entity
@Getter
@Setter

public class Purchase {

    private Customer customer;

    private Cart cart;

    private Set<CartItem> cartItems;
}
