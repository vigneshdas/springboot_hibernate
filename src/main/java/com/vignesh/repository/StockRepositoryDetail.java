package com.vignesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vignesh.model.Stock;
import com.vignesh.model.StockDetail;


@Repository
public interface StockRepositoryDetail extends JpaRepository<StockDetail, Long>{

}
