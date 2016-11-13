/**
 * 
 */
package com.tutorial.sample;

import java.util.Arrays;

/**
 * @author PuneetD
 *
 */
public class Numbers {

	public int Sum(int first,int second){
		return (first+second);
	}
	
	public boolean areNumbersEqual(int first,int second){
		return (first==second);
		
	}
	
	public int[] sortArray(int[] list){
		System.out.println("this is to trigger build");
		Arrays.sort(list);
		return list;
	}
	
	
	public void differentSortArray(int[] list){
		
		
		for(int counter=1;counter<100000;counter++){
			list[0]= counter;
			Arrays.sort(list);
			System.out.println("ffff");
		}
		//
	}
	
	
	
}
