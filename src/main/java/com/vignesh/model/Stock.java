package com.vignesh.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Table(name = "STOCK")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	private Integer stock_Id;

	@Column(name = "STOCK_NAME")
	private String stockName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock") //Here mapped by need to match with stock class association in stockdetail.java class
	@Cascade({CascadeType.ALL})
	private List<StockDetail> stockDetailList;

	public Integer getStock_Id() {
		return stock_Id;
	}

	public void setStock_Id(Integer stock_Id) {
		this.stock_Id = stock_Id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public List<StockDetail> getStockDetailList() {
		return stockDetailList;
	}

	public void setStockDetailList(List<StockDetail> stockDetailList) {
		this.stockDetailList = stockDetailList;
	}

}
