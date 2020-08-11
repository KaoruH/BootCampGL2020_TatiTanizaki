package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.globallogic.bootcamp.patterns.clases.Currency;
import com.globallogic.bootcamp.patterns.clases.Order;
import com.globallogic.bootcamp.patterns.clases.Product;

public class AppTest 
{

	@Test
	@DisplayName("2.1")
	void currencyTest() {
		
		assertEquals("ARS", Currency.getInstance().getName());
		
		Currency.getInstance().setName("USD");
		
		assertEquals("USD", Currency.getInstance().getName());
		
	}
	
	@Test
	@DisplayName("2.2")
	void orderTest() {
		
		Currency.getInstance().setName("ARS");
		
		Order order = new Order("do this, do that", 2, Currency.getInstance());
		
		boolean test1 = order.getDescription().equals("do this, do that");
		boolean test2 = Currency.getInstance().getName().equals("ARS");
		
		assertTrue(test1 && test2);
		assertEquals(2, order.getCount());
		assertEquals(order.getCurrency(), Currency.getInstance());
		
		order = new Order("Open sesame", 5, Currency.getInstance());
		
		test1 = order.getDescription().equals("Open sesame");
		
		assertTrue(test1 && test2);
		assertEquals(5, order.getCount());
		assertEquals(order.getCurrency(), Currency.getInstance());

	}
	
	@Test
	@DisplayName("2.3")
	void productTest1() {
		
		Order order = new Order("Hoccus Poccus", 8, Currency.getInstance());
		order.setProduct(Product.getInstance());
		
		assertEquals("Clavos", order.getProduct().getName());
		
		
	}
}
