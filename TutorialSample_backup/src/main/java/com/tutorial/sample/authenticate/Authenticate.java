package com.tutorial.sample.authenticate;

public class Authenticate {
	String Key;
	public boolean isUserAuthorized(UserInfoInterface user,UserStorageInterface userStorage){
		
		//Interact with the file System
		Key = user.getName()+user.getDOB()+user.getPhoneNumber();
		if(this.Key.equals(userStorage.readFromFile())){
			return true;
		}else {
			return false;
		}
			
		
	}
	
	public boolean storeUser(UserInfo user){
		
		Key = user.getName()+user.getDOB()+user.getPhoneNumber();
			
		//Interact with the file System
		return false;
		
	}
	
	

}
