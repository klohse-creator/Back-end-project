package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data

public enum StatusType {
    PENDING,
    ORDERED,
    CANCELLED;
}


