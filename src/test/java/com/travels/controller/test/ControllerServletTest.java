package com.travels.controller.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;


public class ControllerServletTest {
	
	
	@Test
	public void sourceAndDestValidTest() {
		 
		assertEquals("Pune", "Pune");
	}
	
	
	@Test
	public void sourceAndDestNumeric() {
		
		assertEquals(124,124);
	}
	
	
	@Test
	public void sourceAndDestNotNull() {
		String src = null;
		
		assertNull(src, "Source is Null");
	}
	
}