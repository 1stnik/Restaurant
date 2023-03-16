package com.hillel.restorans.service.impl;

import com.hillel.restorans.entity.Restouran;
import com.hillel.restorans.repository.RestouranRepository;
import com.hillel.restorans.restDto.CreateRestouranDto;
import com.hillel.restorans.restDto.RestouranDto;
import com.hillel.restorans.service.RestouranService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RestouranServiceImpl implements RestouranService {

    private final RestouranRepository restouranRepository;

    @Override
    public RestouranDto create(CreateRestouranDto createRestouranDto) {
        Restouran restouran = new Restouran();
        restouran.setName(createRestouranDto.getName());
        restouran.setCity(createRestouranDto.getCity());
        restouran.setPhoneNumber(createRestouranDto.getPhoneNumber());
        restouran.setEstimatedCost(createRestouranDto.getEstimatedCost());
        Restouran savedEntity = restouranRepository.save(restouran);
        return RestouranDto.fromEntity(savedEntity);
    }

    @Override
    public RestouranDto update(RestouranDto restouranDto) {
        Optional<Restouran> restouranOptional = restouranRepository.findById(restouranDto.getId());
        if (!restouranOptional.isPresent()) {
            throw new RuntimeException("Entity not found!");
        } else {
            Restouran restouranEntity = restouranOptional.get();
            restouranEntity.setName(restouranDto.getName());
            restouranEntity.setCity(restouranDto.getCity());
            restouranEntity.setPhoneNumber(restouranDto.getPhoneNumber());
            restouranEntity.setEstimatedCost(restouranDto.getEstimatedCost());
            restouranEntity.setAverageRating(restouranDto.getAverageRating());
            restouranEntity.setVotes(restouranDto.getVotes());
            Restouran savedEntity = restouranRepository.save(restouranEntity);
            return RestouranDto.fromEntity(savedEntity);
        }
    }

    @Override
    public boolean delete(Long id) {
        boolean isExist = restouranRepository.existsById(id);
        if (isExist) {
            restouranRepository.deleteById(id);
            return true;
        } else return false;
    }

    @Override
    public List<RestouranDto> findAll() {
        return null;
    }

    @Override
    public RestouranDto findById(Long id) {
        return null;
    }
}
