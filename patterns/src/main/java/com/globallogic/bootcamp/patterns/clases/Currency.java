package com.globallogic.bootcamp.patterns.clases;

public class Currency {
	
	private Currency() {
		this.name = "ARS";
	}
	
	private String name;
	
	private static Currency instance = new Currency();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static Currency getInstance() {
		return instance;
	}
	
	

}
