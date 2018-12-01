/** 
 * @purpose:programe for to find smallest and largest  number
 * 
 * @author : swapnil patil
 * 
 * @since : 30/11/2018
 * 
 */



package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;

public class SecondLargest {

	public static void main(String[] args) {
      
		System.out.println("Enter elements: ");
		int a[] = new int[7];
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = Utility.getInt();
		}
           Utility.secondLargeAndSmallElement(a);
	}

}



