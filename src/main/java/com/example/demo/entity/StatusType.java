package com.example.demo.entity;

import jakarta.persistence.Entity;

import lombok.Getter;

import lombok.Setter;

@Entity
@Getter

public enum StatusType {
    PENDING,
    ORDERED,
    CANCELLED;
}


