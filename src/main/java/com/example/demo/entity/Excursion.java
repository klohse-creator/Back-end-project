package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "excursions")
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;

    @Column(name = "excursion_title", nullable = false)
    private String excursion_title;

    @Column(name = "excursion_price", nullable = false)
    private BigDecimal excursion_price;

    @Column(name = "image_url", nullable = false)
    private String image_URL;

    @Column(name = "create_date", nullable = false)
    @CreationTimestamp
    private LocalDateTime create_date;

    @Column(name = "last_update", nullable = false)
    @UpdateTimestamp
    private LocalDateTime last_update;

    @ManyToOne
    @JoinColumn(name = "vacation_id", referencedColumnName = "vacation_id")
    private Vacation vacation;

    @OneToMany
    @JoinColumn(name = "excursion_id")
    private Set<CartItem> cartItems;


}
