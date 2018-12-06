/**
 * @purpose program for to do sort element using merge sort and to print the array
 * @author  swapnil patil
 * @version java jdk1.6
 * @since   06/12/2018
 */


package com.birdgelabz.datastructurep;

import com.utility.Utility;

public class MergeSort {


	public static void main(String[] args) {
		//Utility utility=new Utility();
		int[] num =new int[5];
		System.out.println("Please Enter the number list :");
		for(int i=0;i<5;i++)
		{
			num[i]=Utility.getInt();
		}
		System.out.println("The Given array is :");
		Utility.printArray(num);
		Utility.sort(num, 0, num.length-1);
		System.out.println("\nThe Sorted array is :"); 
        Utility.printArray(num); 
	}
	
	
	
	
}
