package com.tutorial.sample.authenticate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class UserStorage implements UserStorageInterface{


	//Interact with the file System
	public void storeIntoFile(UserInfo userInfo) {
		File file = new File("User.txt");

		// creates the file
		try {
			file.createNewFile();

			// creates a FileWriter Object
			FileWriter writer = new FileWriter(file); 

			// Writes the content to the file
			writer.write(userInfo.getName()+userInfo.getDOB()+userInfo.getPhoneNumber()); 
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	};
	
	
	
	public String readFromFile(){
		try {
			InputStream is;
			is = new FileInputStream("User.txt");
			BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
			String line = buf.readLine(); 
			StringBuilder sb = new StringBuilder();
			while(line != null){ //sb.append(line).append("\n");
				sb.append(line);
				line = buf.readLine();
			} 
			String fileAsString = sb.toString();
			System.out.println("Contents : " + fileAsString);
			return fileAsString;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null; 
	}
	
	public static void main(String args[])throws IOException{
		
		
		UserStorage store = new UserStorage();
		UserInfo userInfo = new UserInfo();
		store.storeIntoFile(userInfo);
		store.readFromFile();
		
	}



}
