package com.hillel.restaurants.service;

import com.hillel.restaurants.restDto.CreateRestaurantDto;
import com.hillel.restaurants.restDto.RestaurantDto;

import java.util.List;

public interface RestaurantService {

    RestaurantDto create(CreateRestaurantDto createRestaurantDto);

    RestaurantDto update(RestaurantDto restaurantDto);

    boolean delete(Long id);

    List<RestaurantDto> findAll();

    RestaurantDto findById(Long id);



}
