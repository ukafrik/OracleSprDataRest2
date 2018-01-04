package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class Lineitem implements Serializable {
	private static final long serialVersionUID = 1L;

	private long orderline;

	private BigDecimal quantity;

	private OrderData orderData;

	private Product product;

	public Lineitem() {
	}

	public long getOrderline() {
		return this.orderline;
	}

	public void setOrderline(long orderline) {
		this.orderline = orderline;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public OrderData getOrderData() {
		return this.orderData;
	}

	public void setOrderData(OrderData orderData) {
		this.orderData = orderData;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}