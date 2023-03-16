package com.hillel.restaurants.restDto;

import com.hillel.restaurants.entity.Restaurant;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class RestaurantDto {


    private Long id;

    private String name;

    private String city;

    private String phoneNumber;
    private BigDecimal estimatedCost;

    private Double averageRating = 0.0D;

    private Integer votes = 0;


    public static RestaurantDto fromEntity(Restaurant restaurant) {
        return RestaurantDto.builder()
                .id(restaurant.getId())
                .name(restaurant.getName())
                .city(restaurant.getCity())
                .phoneNumber(restaurant.getPhoneNumber())
                .estimatedCost(restaurant.getEstimatedCost())
                .averageRating(restaurant.getAverageRating()).votes(restaurant.getVotes()).build();

    }
}
