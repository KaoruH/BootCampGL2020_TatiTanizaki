package com.globallogic.bootcamp.patterns.clases;

public class Order {
	
	public Order(String description, Integer count, Currency currency) {
		this.description = description;
		this.count = count;
		this.currency = currency;
	}

	private String description;
	
	private Integer count;
	
	private Currency currency;
	
	private Product product;
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public Integer getCount() {
		return count;
	}

	public Currency getCurrency() {
		return currency;
	}
}
