/**
 * 
 */
package com.tutorial.retail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author HP
 *
 */
public class ShoppingCartTest {
	ShoppingCart shoppingCart;
	
	@Before
	public void setUP(){
		shoppingCart = new ShoppingCart();
	}
	
	@After
	public void tearDown(){
		shoppingCart = null;
	}
	
	@Test
	public void itemCountTest(){
		int expectedCount=0;
		assertEquals(expectedCount,shoppingCart.getItemCount());
	}
	
	

}
