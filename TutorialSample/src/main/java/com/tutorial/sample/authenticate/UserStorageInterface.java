/**
 * 
 */
package com.tutorial.sample.authenticate;

/**
 * @author PuneetD
 *
 */
public interface UserStorageInterface {
	
	public void storeIntoFile(UserInfo userInfo);
	
	public String readFromFile();

}
