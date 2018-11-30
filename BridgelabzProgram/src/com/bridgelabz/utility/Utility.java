package com.bridgelabz.utility;


 
	import java.util.Random;
	import java.util.Scanner;

	public class Utility {
		private static final Object[] a = null;
		// creating object of Scanner class
		static Scanner scanner = new Scanner(System.in);
		private static int noOfTimes;
		private static int noOfTrials;;

		/**
		 * This method is used to take integer input from user
		 * 
		 * @return integer value
		 */
		public static int getInt() {

			int integer = scanner.nextInt();
			return integer;

		}

		/**
		 * This method is used to take long input from user
		 * 
		 * @return long value
		 */
		public static long getLong() {

			long longValue = scanner.nextLong();
			return longValue;

		}

		/**
		 * This method is used to take double input from user
		 * 
		 * @return double value
		 */
		public static double getDouble() {

			double doubleValue = scanner.nextDouble();
			return doubleValue;
		}

		/**
		 * This method is used to take float input from user
		 * 
		 * @return float value
		 */
		public static float getFloat() {
			float floatValue = scanner.nextFloat();
			return floatValue;
		}

		/**
		 * This method is used to take String input from user
		 * 
		 * @return String
		 */
		public static String getString() {

			String string = scanner.nextLine();
			return string;

         }

		
   //*****************Program for Prime Number********************************//
		
		public static void primecheck(int num) {

			for (int i =2; i < num; i++) {
				// set status of isPrime=true

				boolean isPrime = true;
				
				for (int j = 2; j < i; j++) {
					// check condition
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(i + " ");
				}
			}

		}

	/*	public static int[] getPrime() {
			int[] array = new int[1000];
			boolean isPrime = true;
			int count = 0;
			for (int i = 0; i <= 1000; i++) {
				if (i == 0 || i == 1)
					continue;
				isPrime = true;
				for (int j = 2; j <= i / 2; j++) {

					if (i % j == 0)
						isPrime = false;

				}
				if (isPrime)
					array[count++] = i;
			}
			return array;
		}
	*/
		
	//*************Program for prime factorization******************************//
		
		public static void primeFactor(int number) {
			int i = 1;
			
			//while(i*i<=num)
			while(i<=number) 
			{
				if(number%i == 0)
					System.out.println(i + " is a factor");
			    i++;
	}
			
			
		}
			
		
		
//******************************Program for trigonometric**************************//
		
		public static void trigFuction(double degree) {
			

			
			double radians = Math.toRadians(degree);
			System.out.println("radians is: "+radians);
			
			double sinValue = Math.sin(radians);
			System.out.println("sin("+degree+") = "+sinValue);

			double cosValue = Math.cos(radians);
			System.out.println("cos("+degree+") = "+cosValue);

		}

		
 //********************	programe for Reapating Number********************************//
		
  
		public static void repeatedNumber(int[] arr) {
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = i+1 ; j < arr.length ; j++) {
					if(arr[i] == arr[j]) {
						System.out.println("Repeated value is: "+arr[j]);
				    	}

				    }
							
		      	}
			
	      }
		
		
//***************Programe for Repeating Smallest and Largest element****************//
		
		public static void secondLargeAndSmallElement(int[] a) 
		   {
		    	int store;
			     for(int i = 0 ; i < a.length ; i++) {
			     	for(int j = i+1 ; j < a.length ; j++) {
				    	if(a[i] > a[j]) {
						store = a[i];
						a[i] = a[j];
						a[j] = store;
					   }
			     	}
		       	}
		System.out.println("second largest number is: "+a[a.length - 2]);
			     for(int i = 0 ; i < a.length ; i++) {
			     	for(int j = i+1 ; j < a.length ; j++) {
			     		if(a[i] < a[j]) {
						store = a[i];
						a[i] = a[j];
						a[j] = store;
				     	}
			      	}
		       	}
		System.out.println("second smallest number is: "+a[a.length - 2]);

	}

		
		
		
	//*********************Gambling Number**********************************//
		
		

		public static void checkGambling(int goal, int stake, int trials) {
			// TODO Auto-generated method stub
			
			int wins=0;
			int bets=0;
			 
			float pw = 0;
			float pl;
		
			for(int i = 0;i<noOfTimes;i++)
			{
				int cash = stake;
				while( cash >0 || cash<goal )
				{
					bets++;
					
					if( Math.random() < 0.5) 
						cash--; // wins condition 
						else 
							  cash--;
 					}
						if(cash == goal) {
							wins++;
				
			pw= (wins*100)/noOfTimes;
			int loss;
			pl= (loss*100)/noOfTrials;
				}
				
				
			}
		}

		
	}		
		

		
		
