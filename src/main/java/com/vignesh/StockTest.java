package com.vignesh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vignesh.model.Stock;
import com.vignesh.model.StockDetail;
import com.vignesh.repository.StockRepository;
import com.vignesh.services.StockServices;

public class StockTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		StockServices stockServices = new StockServices();
		Stock stock = new Stock();
		
		
		List<StockDetail> list = new ArrayList<StockDetail>();
		stock.setStockName("Test1");
		StockDetail stockDetail = new StockDetail(new Date(), stock);
		StockDetail stockDetai2 = new StockDetail(new Date(), stock);
		
		list.add(stockDetail);
		list.add(stockDetai2);
		
		stock.setStockDetailList(list);
		
		stockServices.save(stock);

	}

}
