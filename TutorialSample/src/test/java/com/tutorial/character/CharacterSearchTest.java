/**
 * 
 */
package com.tutorial.character;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author HP
 *
 */
public class CharacterSearchTest {
	
	
	CharacterSearch charSearch;
	
	@Before 
	public void setUp(){
		
		System.out.println("Inside the setUp method");
		charSearch = new CharacterSearch();
	}
	
	@After
	public void tearDown(){
		System.out.println("Inside the tearDown method");
		charSearch= null;
	}
	
	@Test
	public void isCharacterAvailable(){
		boolean exist = charSearch.isCharacterAvailable("Puneet", 'e');
		assertTrue(exist);
	}
	
}
