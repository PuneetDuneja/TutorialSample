/**
 * 
 */
package com.tutorial.character;

/**
 * @author HP
 * provides functions to search characters entered in the String
 */
public class CharacterSearch {
	
	public boolean isCharacterAvailable(String str,char c){
		
		if(str.indexOf(c)!=-1){
			System.out.println("it contains letter,first change to trigger build");
			return true;
		} else {
			System.out.println("it does not contain letter");
			return false;
		}
		
	}
	

}
