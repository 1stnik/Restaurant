package com.hillel.restaurants.restDto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateRestaurantDto {

    private String name;

    private String city;

    private String phoneNumber;

    private BigDecimal estimatedCost;


}
