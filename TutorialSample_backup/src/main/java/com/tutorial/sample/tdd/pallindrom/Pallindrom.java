/**
 * 
 */
package com.tutorial.sample.tdd.pallindrom;

/**
 * @author PuneetD
 *
 */
public class Pallindrom {

	
	
	
	
	public boolean isNamePallindrom(StringBuffer name){
		
		String originalName=name.toString();
		String reversedName=name.reverse().toString();
		/*System.out.println("originalName : "+originalName);
		System.out.println("reverse Name : "+reversedName);*/
		return (originalName.equals(reversedName)? true: false);
				
	}

	public String convertToPallindrom(String name) {
		
		char nameChars[]=name.toCharArray();
		int length = name.length();
		StringBuffer convertedName = new StringBuffer();
		int newLength = 0;
		int counter=0;
		System.out.println("length of the input name"+length);
		if(length>1)
			newLength = (length / 2)*2 ;
		else
			return name;
		
		System.out.println("length of the tobe new name"+newLength);
		
		
		while(counter<(length/2)){
			convertedName.append(nameChars[counter]);
			counter++;
			System.out.println("new String-- "+convertedName);
		}
		counter--;
		while(counter>=0){
			convertedName.append(nameChars[counter]);
			counter--;
			System.out.println("new String "+convertedName);
		}
		
		
		
		return convertedName.toString();
	}
	
	
}
