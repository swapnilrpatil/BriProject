package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import com.utility.Utility;

public class RandomNumber {

	public static void main(String[] args) {

		

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Random rand = new Random();
		int value = rand.nextInt(30);
		for(int i =0;i<10;i++) {
			
			list.add(new Integer(i));
			}
		
		  //  Utility.bubbleSort(array);
		 Collections.shuffle(list);
		  Collections.sort(list);

			for(int i=0;i<10;i++) {
				System.out.println(list.get(i));
			}
		
		}
	}	
      /*System.out.println("Enter a random numer do you want: ");
      int number = Utility.getInt();
	    
	    int [] array = new int[10];
	    Random rand = new Random();
        int value = rand.nextInt(10);
	   int index =0;
	    while(index < 10) {
	    	
	    int temp =rand.nextInt(10);
	    Arrays.sort(array);
	    
	    for(int i = 0;i< temp;i++) {
	    	array[i] = temp;
	    }
	    boolean found = false;
	    
	    for(int i=0;i<index;i++) 
	     {
	    	if(array[i] != temp) {
	    		
	    		found =true;
	    		break;
	    	}
	    }
	    
	    if(found == false) {
	    	array[index]= temp;
	    	index++;
	    }
	    
	    }
	}*/
	
	




