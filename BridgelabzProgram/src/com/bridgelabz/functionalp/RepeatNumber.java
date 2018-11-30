/** 
 * @purpose:programe for to find repeated number in array
 * 
 * @author : swapnil patil
 * 
 * @since : 30/11/2018
 * 
 * 
 */



package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;

public class RepeatNumber {
	public static void main(String args[]) {
		
		int[] arr = new int[7];
		System.out.println("Enter numbers: ");
      for(int i=0;i<arr.length;i++) {
	   arr[i] = Utility.getInt();
}
		
		Utility.repeatedNumber(arr);
	}

	 }
	


