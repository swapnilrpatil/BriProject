package com.bridgelabz.functionalp;

import java.util.Random;

import com.utility.Utility;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter a number you times to roll:");
	int number = Utility.getInt();
		
		 
		//Utility.findMaximumNumber(number);
             RollDice rolldie = new RollDice();
             rolldie.rollDice(number);
	}

	
	
	public void rollDice(int n) {
		
		Random random = new Random();
		int [] array = {0,0,0,0,0,0};
		
		for(int i =0 ;i<n ;i++) {
			int  store = random.nextInt(6)+1;
			System.out.println(store);
			
			if(store == 1) {
				array[0]++;
			}
			
			if(store == 2) {
				array[1]++;
			}
			if(store == 3) {
				array[2]++;
			}
			if(store == 4) {
				array[3]++;
			}
			if(store == 5) {
				array[4]++;
			}
			if(store == 6) {
				array[5]++;
			}
		}
		
		/*int max = array[0]; 
		for(int i=0; i<5 ;i++) {
			
			if(array[i]<array[i+1]) {
				max = array[i+1];
				
			}
		} */
		int face = 0;
       int  max = array[0];

        for(int  i = 0; i < 6; i++)

        {

            if(max < array[i])

            {

                max = array[i];
                face = i;
            }

        }
	       	System.out.println( " face"+(face+1)+ " is maximum  i.e."+max+"  time oocure on the dice");
	}
}
