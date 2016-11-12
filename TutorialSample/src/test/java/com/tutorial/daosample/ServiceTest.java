/**
 * 
 */
package com.tutorial.daosample;	
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.tutorial.daomocksample.Dao;
import com.tutorial.daomocksample.Entity;
import com.tutorial.daomocksample.Service;

/**
 * @author PuneetD
 *
 */
public class ServiceTest {

	@Mock private Dao myDao;
	@Rule public MockitoRule rule = MockitoJUnit.rule();

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		Mockito.when(myDao.findById(1L)).thenReturn(createTestEntity());
	}
	
	@Test
	public void testfindById() {
		Service myService = new Service(myDao);
		
		Entity actual = myService.findById(1L);
		Assert.assertEquals("My first name", actual.getFirstName());
		Assert.assertEquals("My surname", actual.getSurname());
		Mockito.verify(myDao).findById(1L);
	}

	private Entity createTestEntity() {
		Entity myEntity = new Entity();
		myEntity.setFirstName("My first name");
		myEntity.setSurname("My surname");
		return myEntity;
	}
}

