package com.vignesh.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vignesh.model.Stock;
import com.vignesh.repository.StockRepository;

@Service
public class StockServices implements StockServiceInterface{

	@Autowired
	StockRepository stockRepository;
	
	@Override
	public Stock save(Stock entity) {
		// TODO Auto-generated method stub
		return stockRepository.save(entity);
	}

	@Override
	public Stock getById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
