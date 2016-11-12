/**
 * 
 */
package com.tutorial.sample.tdd.pallindrom;



import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.sample.tdd.pallindrom.Pallindrom;

/**
 * @author PuneetD
 *
 */
public class PallindromTest {
	
	
	
	@Test
	public void isTheNamePallindrom(){
		
		Pallindrom pallindrom = new Pallindrom();
		
		assertFalse(pallindrom.isNamePallindrom(new StringBuffer("Puneet")));
		assertFalse(pallindrom.isNamePallindrom(new StringBuffer("Feef")));
		assertFalse(pallindrom.isNamePallindrom(new StringBuffer("eeeE")));
	}
	
	@Test
	public void isTheNamePallindrom_PositiveCase(){
		Pallindrom pallindrom = new Pallindrom();
		
		assertTrue(pallindrom.isNamePallindrom(new StringBuffer("FF")));
	
		assertTrue(pallindrom.isNamePallindrom(new StringBuffer("FeeF")));
		
	
	}
	
	@Test
	public void covertToPallindrom(){
		Pallindrom pallindrom = new Pallindrom();
		String actual = new String("testing");
		String expected = new String("tesset");
		assertEquals(pallindrom.convertToPallindrom(actual),expected);
		actual = new String("testiing");
		expected = new String("testtset");
		assertEquals(pallindrom.convertToPallindrom(actual),expected);
		actual = new String("t");
		expected = new String("t");
		assertEquals(pallindrom.convertToPallindrom(actual),expected);
		actual = new String("tt");
		expected = new String("tt");
		assertEquals(pallindrom.convertToPallindrom(actual),expected);
		actual = new String("tte");
		expected = new String("tt");
		assertEquals(pallindrom.convertToPallindrom(actual),expected);
		actual = new String("123");
		expected = new String("11");
		assertEquals(pallindrom.convertToPallindrom(actual),expected);
	}
	
	@Test(expected=NullPointerException.class)
	public void convertToPallindrom_NullCheck(){
		
		Pallindrom pallindrom = new Pallindrom();
		pallindrom.convertToPallindrom(null);
	}
	
	

}
