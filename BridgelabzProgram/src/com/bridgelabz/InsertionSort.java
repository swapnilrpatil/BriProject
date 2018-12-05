package com.birdgelabz.datastructurep;

import com.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {

	System.out.println("Enter the number of element to perform insertion sort: ");
		int number = Utility.getInt();
		int array[] = new int [number] ;
		for(int i=0;i<number;i++) {
			
		   array[i] = Utility.getInt();
		}
		
       Utility.insertionSort(array);
     //  System.out.println("print the result: "+result); 
      
      
		
	//   int array [] = new int[] {10,20,30,14,2};
	   
	  //   Utility.insertionSort(array);
		
	}

}
