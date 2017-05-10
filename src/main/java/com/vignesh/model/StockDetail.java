package com.vignesh.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_DETAIL")
public class StockDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STOCK_DETAIL_ID", unique = true, nullable = false)
	private Integer stockDetailId;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STOCK_ID", nullable = false)
	private Stock stock;

	
	
	
	public StockDetail(Date createdDate, Stock stock) {
		super();
		this.createdDate = createdDate;
		this.stock = stock;
	}

	public Integer getStockDetailId() {
		return stockDetailId;
	}

	public void setStockDetailId(Integer stockDetailId) {
		this.stockDetailId = stockDetailId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
