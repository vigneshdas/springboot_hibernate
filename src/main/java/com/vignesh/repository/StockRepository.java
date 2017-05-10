package com.vignesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vignesh.model.Stock;


@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
