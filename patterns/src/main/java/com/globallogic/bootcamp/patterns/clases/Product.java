package com.globallogic.bootcamp.patterns.clases;

public class Product {
	
	private Product() {
		this.name = "Clavos";
		
	}
	
	private String name;
	
	public static Product instance = new Product();
	
	public static Product getInstance() {
		return instance;
	}

	public String getName() {
		return this.name;
	}

}
