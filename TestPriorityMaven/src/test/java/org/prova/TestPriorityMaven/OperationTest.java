package org.prova.TestPriorityMaven;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class OperationTest {
	
	@Category(Priority.class)
	@Test
	public void testSum() {
		int a = 13;
		int b = 15;
		Operation operazione = new Operation(a,b);
		int c= operazione.sum();
		
		assertEquals(c, 28);

	}
	
	
	@Category(Priority.class)
	@Test
	public void testSum1() {
		int a = 13;
		int b = 15;
		Operation operazione = new Operation(a,b);
		int c= operazione.sum();
		
		assertEquals(c, 27);

	}
	
	
	@Test
	public void testMinus() {
		int a = 15;
		int b = 13;
		Operation operazione = new Operation(a,b);
		int c= operazione.minus();
		
		assertEquals(c, 2);
	}
}
