/**
 * 
 */
package com.tutorial.sample.authenticate;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.tutorial.sample.authenticate.Authenticate;
import com.tutorial.sample.authenticate.UserStorage;
import com.tutorial.sample.authenticate.UserStorageInterface;
import com.tutorial.sample.authenticate.UserInfo;
import com.tutorial.sample.authenticate.UserInfoInterface;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author PuneetD
 *
 */
public class AuthenticateTest {
	
	UserInfoInterface userInfo;
	UserStorageInterface userStorage;
	
	@Before 
	public void createMocks(){
		
		userInfo=mock(UserInfo.class);
		when(userInfo.getName()).thenReturn("Admin");
		when(userInfo.getDOB()).thenReturn("01/04/0000");
		when(userInfo.getPhoneNumber()).thenReturn("000");
		
		userStorage=mock(UserStorage.class);
		when(userStorage.readFromFile()).thenReturn("Admin01/04/0000000");
			
	}
	
	@Test
	public void testIsUserAutherized(){
		Authenticate auth = new Authenticate();
		assertTrue(auth.isUserAuthorized(userInfo, userStorage));
		Mockito.verify(userInfo).getName();
		Mockito.verify(userInfo).getDOB();
		Mockito.verify(userInfo).getPhoneNumber();
		Mockito.verify(userStorage).readFromFile();
		
	}
	
	
	

}
