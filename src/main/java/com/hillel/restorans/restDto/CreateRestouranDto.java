package com.hillel.restorans.restDto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateRestouranDto {

    private String name;

    private String city;

    private String phoneNumber;

    private BigDecimal estimatedCost;


}
