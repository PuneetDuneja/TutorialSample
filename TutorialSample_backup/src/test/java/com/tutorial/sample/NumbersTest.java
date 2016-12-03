/**
 * 
 */
package com.tutorial.sample;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author PuneetD
 *
 */
public class NumbersTest {

	
	Numbers num;
	int first=10; int second=10;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before method called ...:");
		num = new Numbers();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("after method called");
	}

	@Test
	public void testSum() {
		System.out.println("Test Sum called");	
		
		int total=num.Sum(first, second);
		assertEquals(20,total);//(expected,actual)
		
		first=30; second=10;
		total=num.Sum(first, second);
		assertEquals(40,total);
	}
	
	@Test
	public void testAreNumbersEqual() {
		
		System.out.println("testAreNumbersEqual called");	
		first=10; second=10;
		assertTrue(num.areNumbersEqual(first, second));
		
		
		first=30; second=10;
		assertFalse(num.areNumbersEqual(first, second));
		
	}
	
	@Test
	public void testSortArray_real() {
		
		System.out.println("testSortArray_real called");	
		int[] list = {2,4,1,8};
		int[] expected = {1,2,4,8};
		int[] actual=num.sortArray(list);
		assertArrayEquals(expected, actual);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testSortArray_null() {
		
		System.out.println("testSortArray_null called");	
		num.sortArray(null);
		
		
	}
	
	@Test (timeout=10)
	public void testSort_Performance(){
		int array[] = {12,13,1,2};

		num.sortArray(array);
			
	
	}
	
	//You can add parameterized Test 
	//You can add Test Suite

}
