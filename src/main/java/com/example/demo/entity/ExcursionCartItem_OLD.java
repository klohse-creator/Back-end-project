package com.example.demo.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "excursion_cartitem")
public class ExcursionCartItem_OLD {

    @Id
    @ManyToOne
    @JoinColumn(name = "cart_item_id", referencedColumnName = "cart_item_id")
    private CartItem cartItem;

    @Id
    @ManyToOne
    @JoinColumn(name = "excursion_id", referencedColumnName = "excursion_id")
    private Excursion excursion;


}
