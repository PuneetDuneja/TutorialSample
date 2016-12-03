package com.tutorial.sample.authenticate;

public class Authenticate {
	StringBuffer Key= new StringBuffer();
	public boolean isUserAuthorized(UserInfoInterface user,UserStorageInterface userStorage){
		
		//Interact with the file System
		String firstPart=user.getName().substring(0,2);
		String secondPart=user.getDOB().substring(0,2);
		String thirdPart=user.getPhoneNumber().substring(0,2);
		Key.append(firstPart).append(secondPart).append(thirdPart);
		Key.reverse();
		System.out.println("value of the key is "+Key);
		if((this.Key.toString()).equals(userStorage.readFromFile())){
			System.out.println("user is authorised ");;
			return true;
		}else {
			return false;
		}
			
		
	}
	
	public boolean storeUser(UserInfo user){
		
		//Interact with the file System
		String firstPart=user.getName().substring(0,1);
		String secondPart=user.getDOB().substring(0, 1);
		String thirdPart=user.getPhoneNumber().substring(0,1);
		Key.append(firstPart).append(secondPart).append(thirdPart);
		Key.reverse();
			
		//Interact with the file System
		return false;
		
	}
	
	

}
