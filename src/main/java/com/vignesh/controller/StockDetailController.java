package com.vignesh.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vignesh.model.Stock;
import com.vignesh.model.StockDetail;
import com.vignesh.services.StockServices;

@Controller
@RequestMapping("/stockdetail")
public class StockDetailController {

	@Autowired
	StockServices stockServices;

	@RequestMapping("/getStockData")
	public ModelAndView getStockData() {

		Stock stock = new Stock();

		List<StockDetail> list = new ArrayList<StockDetail>();
		stock.setStockName("Test1");
		StockDetail stockDetail = new StockDetail(new Date(), stock);
		StockDetail stockDetai2 = new StockDetail(new Date(), stock);

		list.add(stockDetail);
		list.add(stockDetai2);

		stock.setStockDetailList(list);

		stockServices.save(stock);

		return new ModelAndView("/welcome", "message", "test");
	}

}
