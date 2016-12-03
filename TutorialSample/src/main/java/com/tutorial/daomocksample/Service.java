
package com.tutorial.daomocksample;

/**
 * @author PuneetD
 *
 */
public class Service {
	
	private Dao myDao;

	public Service(Dao myDao) {
		this.myDao = myDao;
	}

	public Entity findById(long id) {
		
		
		return myDao.findById(id);
	}
	
	public String fetchFirstName(long id){
		
		Entity empEntity;
		empEntity=myDao.findById(id);
		if(empEntity.getFirstName().equals("Puneet")){
			System.out.println("call another service,return new service name");
		}
		
		return empEntity.getFirstName();
				
	}
	//formation of key creation logic should always be concatination
	//unless there is change in the requirement from the business side
	//This service is used by multiple components
	//Impact on the code scenario :
	//Someone changed the implementation, that person was not aware thar
	//this code is used by different components ..
	//Just after this change , this person checksin then what happens ?
	//will build be successful ? No
	public String fetchKey(long id){
		Entity empEntity;
		empEntity=myDao.findById(id);
		String key;
		// what is the main thing we are testing here ,
		// we are testing if formation of key is done correctly or 
		// not
		//create the bug in the code
		//key = empEntity.getFirstName()+" "+empEntity.getSurname();
		key = empEntity.getFirstName()+empEntity.getSurname();
		System.out.println("created key is "+key);
		return key;
	}


}
