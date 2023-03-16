package com.hillel.restorans.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
public class Restouran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "estimatedCost")
    private BigDecimal estimatedCost;

    @Column(name = "averageRating")
    private Double averageRating;

    @Column(name="votes")
    private Integer votes;




}
