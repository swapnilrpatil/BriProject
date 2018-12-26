package com.bridgelabz.functional;

import com.utility.Utility;

public class RepeatedNumber {

		public static void main(String args[]) {
			
			int[] arr = new int[7];
			System.out.println("Enter numbers: ");
	      for(int i=0;i<arr.length;i++) {
		   arr[i] = Utility.getInt();
	}
			
			Utility.repeatedNumber(arr);
		}

}
