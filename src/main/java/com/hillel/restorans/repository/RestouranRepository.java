package com.hillel.restorans.repository;

import com.hillel.restorans.entity.Restouran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestouranRepository extends JpaRepository<Restouran, Long> {


}
