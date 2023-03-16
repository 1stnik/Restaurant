package com.hillel.restorans.restDto;

import com.hillel.restorans.entity.Restouran;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class RestouranDto {


    private Long id;

    private String name;

    private String city;

    private String phoneNumber;
    private BigDecimal estimatedCost;

    private Double averageRating = 0.0D;

    private Integer votes = 0;


    public static RestouranDto fromEntity(Restouran restouran) {
        return RestouranDto.builder()
                .id(restouran.getId())
                .name(restouran.getName())
                .city(restouran.getCity())
                .phoneNumber(restouran.getPhoneNumber())
                .estimatedCost(restouran.getEstimatedCost())
                .averageRating(restouran.getAverageRating()).votes(restouran.getVotes()).build();

    }
}
