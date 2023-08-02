package com.example.demo.entity;

import jakarta.persistence.Entity;

import lombok.Getter;

import lombok.Setter;



public enum StatusType {
    PENDING,
    ORDERED,
    CANCELLED;
}


