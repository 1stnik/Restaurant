package com.hillel.restorans.service;

import com.hillel.restorans.restDto.CreateRestouranDto;
import com.hillel.restorans.restDto.RestouranDto;

import java.util.List;

public interface RestouranService {

    RestouranDto create(CreateRestouranDto createRestouranDto);

    RestouranDto update(RestouranDto restouranDto);

    boolean delete(Long id);

    List<RestouranDto> findAll();

    RestouranDto findById(Long id);



}
