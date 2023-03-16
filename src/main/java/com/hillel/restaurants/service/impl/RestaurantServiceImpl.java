package com.hillel.restaurants.service.impl;

import com.hillel.restaurants.entity.Restaurant;
import com.hillel.restaurants.repository.RestaurantRepository;
import com.hillel.restaurants.restDto.CreateRestaurantDto;
import com.hillel.restaurants.restDto.RestaurantDto;
import com.hillel.restaurants.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Override
    public RestaurantDto create(CreateRestaurantDto createRestaurantDto) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(createRestaurantDto.getName());
        restaurant.setCity(createRestaurantDto.getCity());
        restaurant.setPhoneNumber(createRestaurantDto.getPhoneNumber());
        restaurant.setEstimatedCost(createRestaurantDto.getEstimatedCost());
        Restaurant savedEntity = restaurantRepository.save(restaurant);
        return RestaurantDto.fromEntity(savedEntity);
    }

    @Override
    public RestaurantDto update(RestaurantDto restaurantDto) {
        Optional<Restaurant> restouranOptional = restaurantRepository.findById(restaurantDto.getId());
        if (!restouranOptional.isPresent()) {
            throw new RuntimeException("Entity not found!");
        } else {
            Restaurant restaurantEntity = restouranOptional.get();
            restaurantEntity.setName(restaurantDto.getName());
            restaurantEntity.setCity(restaurantDto.getCity());
            restaurantEntity.setPhoneNumber(restaurantDto.getPhoneNumber());
            restaurantEntity.setEstimatedCost(restaurantDto.getEstimatedCost());
            restaurantEntity.setAverageRating(restaurantDto.getAverageRating());
            restaurantEntity.setVotes(restaurantDto.getVotes());
            Restaurant savedEntity = restaurantRepository.save(restaurantEntity);
            return RestaurantDto.fromEntity(savedEntity);
        }
    }

    @Override
    public boolean delete(Long id) {
        boolean isExist = restaurantRepository.existsById(id);
        if (isExist) {
            restaurantRepository.deleteById(id);
            return true;
        } else return false;
    }

    @Override
    public List<RestaurantDto> findAll() {
        return null;
    }

    @Override
    public RestaurantDto findById(Long id) {
        return null;
    }
}
