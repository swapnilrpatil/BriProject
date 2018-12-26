package com.utility;
import com.bridgelabz.datastructure.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.fuctionandLibrary.StringFuction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;


public class Utility implements CharSequence {
//	private static final Object[] a = null;
	private static final double PI = 0;
	private static final double result = 0;
	// creating object of Scanner class
	static Scanner scanner = new Scanner(System.in);
	//private static int noOfTimes;
	//private static int noOfTrials;;

	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * This method is used to take integer input from user
	 * 
	 * @return integer value
	 */
	public static int  getInt() {

		int integer = scanner.nextInt();
		return integer;

	}

	
	/*
	  program to take input of array
	 
	
	
	public static String  nextInt() {

		int integer = scanner.nextInt();
		return getString();

	} */
	
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
	

	/**
	 * @return boolean a user given boolen value
	 */
	public static  boolean inputBoolean() {
		return scanner.nextBoolean();
	}
	
	
  /**
   * this method is used to give a given zero number 
   * @return 
   */
	public static String giveZero(int numberofzeroRequired) {
		String s ="";
		for(int i=0;i<numberofzeroRequired;i++)
		{
			s=s+0;
		}
		return s;
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

	
	
	
//***************gambling program for  checking win loss*******************************//
	
	public static void calWinLossInGambling(int stake, int goal, int chance) {       
		int win = 0;
		int loss = 0;

		for (int i = 0; i < chance; i++) {
			while (stake < goal && stake > 0 && chance > 0) {
				if (Math.random() >= 0.5)
				{
					stake++;
					win++;
					chance--;
				} 
				else 
				{
					stake--;
					loss++;
					chance--;
				}
			}
		}
		double percentWin = (win * 100) / (win + loss);
		double percentLoss = (loss * 100) / (win + loss);
		System.out.println("the player won " + win + " times.");
		System.out.println("the player lost " + loss + " times.");
		System.out.println("percentage of win is " + percentWin + "%");
		System.out.println("percentage of loss is " + percentLoss + "%");
	}
//****************************Prime factor for*****************************//
	
	public static void primeFactor(int number) {
		while(number%2==0)
		{
			System.out.println("2");
			number/=2;
		}
		for (int i=3;i<Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				System.out.println(i);
				number/=i;
			}
		}
		if(number>2)
		{
			System.out.println(number);
		}
		return;
	}

	
//***********************Binary To Decimal***************************//
	
	public static  void binaryToDecimal(int number) {

		int binary [] = new int[32];
		int index = 0;
		 
		while(number != 0 ) {
			binary [index++] = number % 2;
			number = number / 2;

		}
		
		for(int i = index - 1 ; i>=0 ; i--) {
			System.out.println( binary[i]);
		}
	}

//********************Program to print sin series******************************************//
	

	public static void printSeriesOfSin1(int number, double degree  ) {
		// TODO Auto-generated method stub
		
	int i=1;
 //  double x = 0;
double nr=degree;
   double dr=1;
  double term = 0;
double  sum = 0 ;
 

	while(i >=1)
	{
		term = (int) (nr/dr);
		
	
 if(i%2!=0) {
	 sum = (float) (sum+term); 
 }
 else {
	 sum = sum-term;
 }
	nr = nr*degree*degree;
	dr=dr*2*i*(2*i+1);
	i++;
	}
	
System.out.println("sum of " +number+"term is = "+sum);

}

	
	// ***********************factorial*******************//
	
	/*public static double factorial(double n) {
		// TODO Auto-generated method stub
		int fact = 1;
		//int num = n;
		for(int i=1;i<=num;i++) {
			fact = fact *i;
		}
		return 0;
	}*/
	//**********************Leap Year Program***************************************//
	
	public static boolean leapYearCheaker(int year)
	{
		if(year>1000)
		{
		   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		   {
		       return true;
		   }
		}
		return false;
	}
	
	
	
	//****************DayOfWeek************************************

		/**
		 * @param y input integer value from user 
		 * @param m input integer value from user 
		 * @param d input integer value from user 
		 */
		
		public static int getDayOfWeek(int y, int m, int d) {
	        int y0 = y - (14 - m) / 12;
	        
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        
	        int d0 = (d + x + (31*m0)/12) % 7;	
	        return d0;
	     }
		
		
		
		
	
		
		
		//*************** method for to integer anagram *****************//
		
		public static void anagramForInteger(int n) {
			
			boolean flag = false;
			int k =0,i;
			int [] intArray = new int[n];
			for(i= 0 ;i<n;i++) {
				for(int j=2;j<i;j++) {
					
					if(i%j==0)       
	                {
	                    flag = false;
	                    break;
	                }
	                else
	                    flag = true;
	            }
	      
	            if(flag)
	            {
	                 //Number should not be 0 or 1
	                if(i!=1 || i!=0)              
	                {
	                    //System.out.print(i+" ");                        
	                    intArray[k] = i;         
	                    k++;                       
	                }
	            }
	        }
	        System.out.println("Anagrams are :");
	        anagramForInteger(k);         
				
		}

			

		
		
//*************************Program for palindrome string*********************************//
		

		public static void isPalindromeString(String str) {
		
		int length  = str.length();
	    int i, low, high, middle;
	 
	    low  = 0;
	    high    = length - 1;
	    middle = (low + high)/2;
	 
	    for (i = low; i <= middle; i++) {
	      if (str.charAt(low) == str.charAt(high)) {
	        low++;
	        high--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("string is a Palindrome");
	    }
	    else {
	      System.out.println("string Not a palindrome");
	    }  
	  }

		
 //**************Anagram using iteration***************************************//
		
		
		public static String permutation(String string, int i, int j) {
			if(i==j)
				System.out.println(string);
			else {
				for(int index =i;index<=j;index++) {
					string = swap(string,i,index);
					permutation(string, i+1, j);
					string = swap(string,i,index);
				}
			}
			return string;
		}

		private static String swap(String string, int i, int j) {
			char temp;
			char[] ch = string.toCharArray();
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			return String.valueOf(ch);
		}

		
			
	//****************************************Binary Program******************************//
			
			public static String swapNibbles(String binary) {
				String str1,str2,temp,temp1,temp2;
				
				str1 = binary.substring(0,4);
				temp1 = str1;
				
				str2 = binary.substring(4,8);
				temp2 = str2;
				
				/*temp = str1;
				str1 = str2;
				str2 = temp;	
				String strAfterSwap = str1 + str2;
				System.out.println("String after swapping " +strAfterSwap);*/
				
				String strAfterSwap = temp2 + temp1;
				
				return strAfterSwap;
			}
			
			public static double convertToDecimal(String swap) {
				double decimal = 0;
				//decimal=Integer.parseInt(swap,2);  
				
				int binaryNumber = Integer.parseInt(swap);
				int i = 0;
				while(binaryNumber>0) {
					int temp = binaryNumber%10;
					decimal = decimal + (temp * Math.pow(2, i));
					binaryNumber = binaryNumber/10;
					i++;
				}
				
				return decimal;
			}
			
			public static String toBinary(int number) {
				String binary = "";
				int value = 0;
				while(number>0) {
					value = number%2;
					binary = value+binary;
					number = number/2;
				}
				
				while(binary.length() < 8){
					binary = 0 + binary;
				}
				
				return binary;
				
			}
			
//****************************** Gambler code****************************************//

			public static void gambler(int noOfTimes, int stake, int goals) {
				int wins = 0;
				
				for(int index=0;index<noOfTimes;index++) {
					while(stake>0 && stake<goals) {
						if(Math.random()<0.5)
							stake++;
						else 
							stake--;
					}
					if(stake == goals)
						wins++;
				}
				System.out.println("Number of wins : "+wins);
				System.out.println("Percentage of wins : "+(wins*100)/noOfTimes);
				System.out.println("Percentage of loss : "+(100-((wins*100)/noOfTimes)));
				
			}
			
			
			
//*********************************Program for harmonic Number********************************//
			
			
			public static double harmonicValue(double number) {

				float sum=0;
				for(int i=1;i<=number;i++){
						sum=sum+(1/(float)i);
					System.out.print(" 1/"+i+" is");	
				}
				System.out.println(" ");
      		 	return sum;
			
}
	
			
//*******************************Square root programe*******************************************//
			
			public static double findSquare(double c) {
				
				 double  epsilon = 1e-15;
				  
				double t = c;
			      
			    while(Math.abs(t-c/t)>epsilon*t) {
			    	t=(c/t+t)/2.0;
			    	
			        }
					return t;
				
			}

	//**********************factor**********************//
			
			/*public static double factorial(int n) {
				// TODO Auto-generated method stub
				int fact = 1;
			//	  n= i;
				for(int i = 1 ; i<= n ; i++) {
					fact = fact*i;
				}
       		    return fact;
			} */
			
			
//*******************Sin series******************************//
			

			public static void printSeriesOfSin(int number, double degree  ) {
				// TODO Auto-generated method stub
				
			int i=1;
	     //  double x = 0;
		double nr=degree;
	       double dr=1;
	      double term = 0;
	    double  sum = 0 ;
	     
	   
	    	while(i >=1)
	    	{
	    		term = (int) (nr/dr);
	    		
	    	
	     if(i%2!=0) {
	    	 sum = (float) (sum+term); 
	     }
	     else {
	    	 sum = sum-term;
	     }
			nr = nr*degree*degree;
			dr=dr*2*i*(2*i+1);
			i++;
			}
			
		System.out.println("sum of " +number+"term is = "+sum);
		
		}

			
				
			
//*********************   sin and cos *********************************//
			
			
			public static double sinAngle(double value) {
				double result = Math.sin(Math.toRadians(value));
				return result;
				
			}

			public static double cosAngle(double value) {
				double result = Math.cos(Math.toRadians(value));
				return result;
		}
//******************Find a palindrome****************************************//
			
			
			public static boolean isPrime(int n) {
				//n>=100
				for(int j=2;j<=n/2;j++) {
					int rem = n % j;
					
					if(rem == 0) {
						return false;
					}
					
				}
				return true;

}
			/**
			 * Function is used to check the pallindrome prime numbers
			 * 
			 * @param number which is to be checked for pallindrome
			 * @return true if the given number is pallindrome,false if it is not
			 */
			public static boolean isPallindrome(int number) 
			{
				int temp=number;
				int reverseNumber=0;
				while(number>0)
				{
					int remainder= number%10;
					reverseNumber=(reverseNumber*10)+remainder;
					number/=10;
				}
				return (temp==reverseNumber);
			}
			
			/**
			 * This function is used to find prime numbers 
			 * between 0 to 1000
			 */
			
			public static boolean findprimenumber(int number) {

				for(int j=2;j<=number/2;j++)
				{
					int rem =number%j;
					if(rem==0)
					{
						return false;
					}
				}
				return true;
			}
			
 //******************************Program for min and max value *****************************//
			

		/*	  // Method for getting the maximum value
			  public static int printMaxValue(int number){
				  int [] a = new int [number];
			    int maxValue = a[0];
			    System.out.println("enter a value ");
			    for(int i=0;i<number;i++) {
			    	a[i]=Utility.getInt();
			    }
			    for(int i=1;i < a.length;i++){ 
			      if(a[i] > maxValue){ 
			         maxValue = a[i]; 
			      } 
			    } 
			    return maxValue; 
			  }

			  
			  // Method for getting the minimum value
			  
			  public static int printMinValue(int number){ 
				  int [] a = new int[number];
			      int minValue = a[0]; 
			      for(int i=0;i<number;i++) {
			    	  a[i] = Utility.getInt();
        			      }
			      
			    for(int i=1;i<a.length;i++){ 
			      if(a[i] < minValue){ 
			        minValue = a[i]; 
			      } 
			    } 
			    return minValue; 
			  } 
       */
				
			
//****************************Program for to calculate Future value*************************//
			
			public static double futureValue(double value, double rate, int time) {
				
			//	double p=compound;
				//double q=rate;
			//	double r=time;
			double futureValue = value*(Math.pow(1+rate, time));
			return futureValue;
			}
//************************Program for to calculate present value**************************//
			
			public static double presentValue(double value, double rate, int time) {
				
				double presentValue = value / (Math.pow(1+rate, time));
				return presentValue;
				
			}

	//**************Min max using String***************************//
			

			  // Method for getting the maximum value
				  public static int maxUsingString(int[] inputArray){ 
				    int maxValue = inputArray[0]; 
				    for(int i=1;i < inputArray.length;i++){ 
				      if(inputArray[i] > maxValue){ 
				         maxValue = inputArray[i]; 
				      } 
				    } 
				    return maxValue; 
				  }
				 
				  // Method for getting the minimum value
				  public static int minUsingString(int[] inputArray){ 
				    int minValue = inputArray[0]; 
				    for(int i=1;i<inputArray.length;i++){ 
				      if(inputArray[i] < minValue){ 
				        minValue = inputArray[i]; 
				      }
			
			
			
			
				
			
	  }
					return minValue;
	  }
	
	//******************minmax***********************************************//
				  
				  
				  public static  int  max(int [] array){
					  
					  int max = array[0];
					  for(int i=0;i<array.length;i++) {
						  
						  if(array[i]>max) {
							  max = array[i];
							  
						  }
					  }
					   return max;
					  
				  }
					  
			
				  public static int min(int [] array) {
					  
					  int min = array[0];
					  for(int i= 0;i<array.length;i++) {
						  if(array[i]<min) {
							  
							  min = array [i];
							  
						  }
					  }
					   return min;
				  }
//*********************program for to check collinear or not**********************************//
				  
	public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
			
	    int a =	(y2-y1)/(x2-x1);
		int b = (y3-y2)/(x3-x2);
		int c = (y1-y3)/(x1-x3);
		
		if( a == b && b== c) {
			return true;
		}
		return false;
		    
	}
	
//**************************** program for triangle*****************************//
	
	public static boolean checkTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		
		
	    int a =	(x1-x2);
		int b = (y1-y2);
		int c = (y1-y2);
		int d = (y2-y3);
		int determinant = (a*d) -(b*c);
	   int store = (1/2)* determinant;
		 
		if( store == 0) {
			return true;
		}
		return false;
		    
	}
	

	//********************************Program for calendar*************************//
	
	
	public static void calender(int month, int year) {

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"Octomber", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && Utility.leapYearCheaker(year))
			days[month] = 29;
		System.out.println("   " + months[month] + " " + year);
		System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
		int d = Utility.day(month, 1, year); // d having value between 0 to 6
		for (int i = 0; i < d; i++)
			System.out.print("\t"); // till d we add space
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("\t" + i);
			if (((i + d) % 7 == 0)) // this condition satisfied terminates to next line
				System.out.println();
		}
	}
		

	/**calculate the day in between range 0 to 6
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;

	}

	//******************program for Binary Search a word*********************************//
	
	public static int binarySearchWord(String search, String[] words, int first, int last) {
	 
		 if(last <= first)
			return -1;
		
		if(last - first == 1)
			return words[first].equals(search) ? first : -1;

		int mid = (first + last)/2;
		
		if(search.compareTo(words[mid]) < 0)
		{
			return binarySearchWord(search, words, 0, mid-1);
		}
		else if(search.compareTo(words[mid]) > 0)
		{
			return binarySearchWord(search, words, mid, last);
		}
		return mid;
	}
	
	
		
	

	//*****************Program for insertion sort**********************************//
	
	public static void insertionSort(int [] array) {
		
		int num = array.length;
	
		for(int i=0;i<num;i++) {
	     int key = array[i];		
			int temp = 0;
	        int j = i-1;
	     
		while(j>=0 && array[j]>key) {
			
			array[j+1] = array[j];
			j--;
		}
		  array[j+1] = key;	     
	     
		}
	  for(int i=0;i<num;i++) {
		  System.out.println(array[i]);
	  }
	  System.out.println();
}
	
	
	/**
	 * Function is used to merge the elements and separated
	 * into two halves
	 * 
	 * @param array integer taken a array number from the user
	 * @param First integer the number is first element form array
	 * @param mid integer is the middle value of array
	 * @param  Last integer the number is last element from array
	 */
	public static void merge(int array[], int low, int mid, int high) 
    { 
         
        int n1 = mid - low + 1; 
        int n2 = high - mid; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = array[low + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[mid + 1+ j]; 

        int i = 0, j = 0;         
        int k = low; //create new sorted index
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                array[k] = L[i]; 
                i++; 
            } 
            else
            { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	
	/**
	 * Function is used to sort the number which is provided
	 * by the user
	 * 
	 * @param array taken as a input from user
	 * @param First integer the number is first element form array
	 * @param Last integer the number is last element from array
	 */
	public static void sort(int array[], int low, int high) 
    { 
        if (low < high) 
        { 
            int mid = (low+high)/2; 
            sort(array, low, mid); // recursion 
            sort(array , mid+1, high); 
            merge(array, low, mid, high); 
        } 
    } 
	
	/**
	 * Function is used to display the array 
	 * @param array integer taken a array number from the user
	 */
	public static void printArray(int array[]) 
    { 
        int number = array.length; 
        for (int i=0; i<number; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    }

	
	//*******************insertion sort ******************************//
	
	
	
	public static void insertion(int[] array) {
		
		int n = array.length;
		
		for(int i=0;i<n;i++) {
			
			int key = array[i];
			int j= i-1;
			
			while(j>=0 && array[j]>key) {
				
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
			
		}
			for(int i=0;i<n;i++) {
				
				System.out.println(array[i]);
			}
		
		
	}
//*******************Bubble sort Algorithm**********************//
	
	public static double  bubbleSortP( int[] array) {

		int n = array.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(array[i]>array[j]) 
				   {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
              		}
		      	}
      		}
		
			for(int i=0;i<n;i++) {
				
				System.out.println(array[i]);
			}
			return n;
			 
			
		
	}
	
	//******** bubble sort for sring ********//
	
	public static String[] bubbleSortString(String[] str, int size) {
		for(int i =0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if((str[j].compareTo(str[j+1]))>0){
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		return str;
	}
	

	
//********************************Binary Search **********************************//
	
	
	public static int binarySearchString(String[] array, String search, int i) {
		// TODO Auto-generated method stub
		int first = 0;
    	int last  = array.length-1;
 
    	while (first <= last) 
    	{
        	int mid = (first + last) / 2;
        	if (search.compareTo(array[mid]) < 0) 
        	{
           			last = mid-1;
        	} 
        	else if (search.compareTo(array[mid]) > 0) 
        	{
            		first = mid + 1;
        	} 
        	else 
        	{
            		return mid;
        	}
    	}		
             return -1;
	}

 // **************************program for recursion ***********//
	
	public static void recursion(String str, int i, int length) {
		

		//length = length;
		if(i == length) {
			System.out.println("print string :" +str);
  		}
		else {
			int j=i;
		
				while(j<length)
				{
					str = swap(str, i, j);
					recursion( str, i+1, length);
					str=swap(str, i, j);	
					j++;
				}
				
		}
	}

	//************* Find your number ****************************//
	
	public static void findyourNumber(int i, int n) {
		
		int low =0;
		int high = n-1;
		
		int mid = (low +high)/2;
		
		if(high<=low) {
			
			return ;
		} 
			while(low<=high) {
				
				if(n<mid) {
					low = mid - 1;
				}else {
					high = mid + 1;
				}
				 mid = (low+high)/2;
			 System.out.println("your number is "+mid);
				 
			}
	   System.out.println("number is not taken:");	
		
	}
 
	
	
	//*******************Guessing nmber ***************************//
	
	/**
	 * @param low the lowest value from which search operation starts 
	 * 		  each time when the method is called
	 * @param high the highest value upto which search operation will 
	 * 		  continue when the method is called
	 * @return the (index of the element)/index which the user thought of
	 */
	public static int search(int low, int high)
	{
		//Utility utility=new Utility();
		int mid=(low+high)/2;
		
		if(low<high)
		{
			System.out.println("Is your number in between "+low+" and "+mid);
			if(Utility.inputBoolean())
			{
				return search(low,mid);
			}
			else
			 {
				System.out.println("Is your number between "+mid+"and"+high);
				return search(mid+1,high);
			 }
		}
		else
		{
			System.out.println("the number is "+low);
			return low;
		}
	}


	 /**
	  *  method for to print twod array as integer float and boolean
	  * 
	  */
	
 	public static void print2DArray(int choice) {
 		
 		System.out.println("Enter no of rows of 2D Array:");
 		int row = Utility.getInt();
 		System.out.println("Enter no of col of 2D Array:");
 		int col = Utility.getInt();
 		System.out.println("Enter element for row col wise:");
 		
 	
 		switch(choice)
		{
		case 1:
		     Integer[][]	intArray=new Integer[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					intArray[i][j]=Utility.getInt();
				}
			}
			//print2DArrayElement(intArray);
			
			 for(int i=0;i<row;i++) 
			  {
				 for(int j=0;j<col;j++) 
				 {
					 System.out.print(intArray[i][j]+"\t");
					 
					// System.out.println(intArray[i][j]+" ");
				 }
				 System.out.println();
			 }
			 	break;
		case 2:
               Double[][] doubleArray = new Double [row][col];
			for(int i=0;i<row;i++) 
			 {
				for(int j=0;j<col;j++) 
				{
					doubleArray[i][j] =Utility.getDouble();
				}
			}
			
			//print the double array
			
			for(int i=0;i<row;i++) 
			 {
				for(int j=0;j<col;j++) {
					System.out.print(doubleArray[i][j]+"\t");
				}
				System.out.println();
			}
				break;
		case 3:
			 Boolean [][] booleanArray = new Boolean [row][col];
				for(int i=0;i<row;i++) 
				 {
					for(int j=0;j<col;j++) 
					{
						booleanArray[i][j] =Utility.inputBoolean();
					}
				}
				
				//print the double array
				
				for(int i=0;i<row;i++) 
				 {
					for(int j=0;j<col;j++) {
						System.out.print(booleanArray[i][j]+"\t");
					}
					System.out.println();
				}
				break;
 		
		default:System.out.println("Invalid choice that you entered");
 		
		}		
 	}

 	/*11. Store 1-1000 prime numbers into 2D Array*/
	public static int[] prime2DArray(int range) {
		int array[] = new int[range];

		int index=0;
		for(int value=2;value<range;value++) {
			if(isPrime(value)) {
				array[index] = value;
				index++;
			}
		}
		return array;
		
	}
	
	public static int[][] twoDPrimeArray(int[] array) {
		int [][]prime = new int [10][36];
		int first=0,second=0,third=0,fourth=0;
		int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
	
		for(int i=0;i<168;i++) {
			
			if((array[i] > 0) && (array[i] <= 100)){
				prime[0][first++] = array[i];
			}
			else if((array[i] > 100) && (array[i] <= 200)){
				prime[1][second++]=array[i];
			}
			else if((array[i] > 200) && (array[i] <= 300)) {
				prime[2][third++] = array[i];
			}
			else if((array[i] > 300) && (array[i] <= 400)) {
				prime[3][fourth++] = array[i];
			}
			else if((array[i] > 400) && (array[i] <= 500)) {
				prime[4][fifth++] = array[i];
			}
			else if((array[i] > 500) && (array[i] <= 600)) {
				prime[5][sixth++] = array[i];
			}
			else if((array[i]>600)&&(array[i]<=700)) {
				prime[6][seventh++]=array[i];
			}
			else if((array[i] > 700) && (array[i] <= 800)) {
				prime[7][eight++] = array[i];
			}
			else if((array[i] > 800) && (array[i] <= 900)) {
				prime[8][nineth++] = array[i];
			}
			else if((array[i] > 900) && (array[i] <= 1000)){		
				prime[9][ten++] = array[i];
			}
		}
		return prime;
	}
	
	public static void printPrimeArray(int[][] primeArray) {
		for(int i=0;i<10;i++) {
			  for(int j=0;j<25;j++) {
				  if(primeArray[i][j]!=0) {
					  System.out.print(" |"+primeArray[i][j]+"| ");
				  }
			  }
			//  System.out.println("");
		  }
		
		
	}
	
	// ******   Prime Anagrams into 2D Array********************************/
	
	public static int[] primeAnagrams(int range) {
		int index = 0;
		String[] array1 = new String[168];
		int[] anagram = new int[168];
		int count = 0;
		
		for(int i=2;i<range;i++){
			if(Utility.isPrime(i)) {
				array1[index] = String.valueOf(i);
				index++;
			}
		}
		
		
		
		for(int i=0;i<index;i++) {
			for(int j=i+1;j<index;j++) {
				if(Utility.isAnagram(array1[j], array1[i])) {
					anagram[count] = Integer.parseInt(array1[i]);
					count++;
					anagram[count] = Integer.parseInt(array1[j]);
					count++;
				}
			}
		}
		
		return anagram;
	}
	public static boolean isAnagram(String str1, String str2) {
		boolean status=true;
		
		if(str1.length() != str2.length())
			status = false;
		else {
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			status = Arrays.equals(str1Array, str2Array);
 		}
		if(status)
			return true;
		else 
			return false;
	}
	
 	//****************** method for to check prime anagram check *********//


	public static void primePalindromeCheck(int range) {
		
		System.out.println(" output is given below: ");
	  for(int index = 0;index<range;index++) {
		  if(isPrime(index) && isPallindrome(index)) {
			  System.out.println(index+"\t");
		  }
		  
	  }
		
	}
 	
 	//*************** unorderd *******************************************//
 	
 	
 	public static String readAllFile(String fileName) throws IOException {
		
		String line = null;
		String readFile = " ";
		
		try {
			
			FileReader fileReader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fileReader);
			
			while((line = br.readLine()) != null) {
				
				readFile  = readFile+line;
				
			}
			br.close();
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.out.println("Your file is not foud at "+fileName);
		}
		
		catch(IOException ioException) {
			System.out.println("Reading error in a file:"+fileName);
		}
		
		return readFile;
 	}		
 	 		
 	
 	
  //*************** Method is used for to write a file ****************//	
 	
	public static void writeallFile(String fileName , String content ) {
		
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter br = new BufferedWriter(fileWriter);
			br.write(content);
			br.close();
			
		}
		catch(IOException ioException) {
			System.out.println(" Error in writing a file:"+fileName+" ' ");
		}
		
	}

  //******************** Method is used to print the triplet ********************//

	public static void printTriplet(int[] array) {
		
     	int size = array.length;
		int count = 0;
		
		for(int i=0;i<size-2;i++) {
			for(int j=i+1;j<size-1;j++) {
				for(int k=j+1;k<size;k++) {
					
					if(array[i]+array[j]+array[k] == 0) {
						System.out.println("Triplets are: " +array[i]+" "+array[j]+" " +array[k] );
						count++;
					}
						
					}
				}
			}
		
	
	      	System.out.println("pair count is :"+count++);
	}
 
	
	//************************** Print 2D array element ********************//
	
	
	
		public static <E> void print2DArrayElement(E[][] inputArray)
		{
			for (E[] outerElements : inputArray) 
			{
				for (E innerElements : outerElements) 
				{
					System.out.print(innerElements+" ");
				}
				System.out.println();
			}
		}
		

	//******************** method for bubble sort *******************************//
		
		public static void bubbleSort(String[] array) {
			// TODO Auto-generated method stub
			int n = array.length;
			
			for(int i=0;i<n;i++) {
				
				for(int j=i+1;j<n;j++) {
					
					if(array.equals(array)); 
					   {
						String temp = array[i];
						array[i] = array[j];
						array[j] = temp;
	              		}
			      	}
	      		}
			
				for(int i=0;i<n;i++) {
					
					System.out.println(array[i]);
				}
			
		}

		//**************************** Method for to find your number ******************//
		
		public static void findNumber(int low, int high) {
			
			if(low==high) {
				System.out.println("Your number is :"+low);
				System.out.println("your number is "+(low-1)+"and"+(low+1));
				return;
			}
			
			int mid =(low+high)/2;
			
			int choice;
			System.out.println("Enter press choice 1:"+low+"-"+mid);
			System.out.println("Enter press choice 2:"+(mid+1)+"-"+high);
			
			 choice =Utility.getInt();
			 
			 if(choice == 1) {
				 findNumber(low, mid);
			 }
			 else if(choice == 2) {
				 findNumber(mid+1,high);
			 }
			 else
				 System.out.println("Invalid choice :");
		}

		
	//***************** Regular expression **********************************//
		
		public static void regexExpression(String fname, String mobnum , String fname1) {
			
			String Message = "Hello <<name>>, We have your full name\n" +
			           
		                "as <<full name>> in our system. your contact number is +91­xxxxxxxxxx. Please,let us\n" +
		                "know in case of any clarification Thank you BridgeLabz 01/01/2016. " ;
		       
		        String regexName = "<<name>>" ;
		       
		        String regexFname = "<<full name>>" ;
		        
		        String regexNum = "­xxxxxxxxxx";
		       
		        String regexDate = "01/01/2016";
		       
		        SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");

		        Date date = new Date();
		       
		        String fdate = Date.format(date);
		       
		        //System.out.println("Date: " +fdate);
		        Message = details(Message, regexName, fname1);
		        Message = details(Message, regexFname,fname );
		        Message = details(Message, regexNum, mobnum);
		        Message = details(Message, regexDate, fdate);
		       

		        System.out.println(Message);
		}
		
	    public static String details(String Template , String regexName , String regexFname){
		       
	        //pattern object which defines the regular expression
	       
	        Pattern pattern = Pattern.compile(regexName);
	       
	        //matcher object
	        Matcher match = pattern.matcher(Template);
	        return match.replaceAll(regexFname);

	    }
	
	//***************** method for replacement of regex ***************//
	    public static String replaceWithpattern(String str , String replace) {
	    	Pattern pattern = Pattern.compile("\\s+");
	    	Matcher matcher = pattern.matcher(str);
	    	return matcher.replaceAll(replace);
	    }
	    
	 //*************** method for replace all ***********************//
	    public String replaceAll(String regex, String replacement) {
	        return Pattern.compile(regex).matcher(this).replaceAll(replacement);
	    }
	    
	//*************** Tic Tac Toe ***********************************//
	    
	 	
	   public static void printGameArray(int[][] gameArray) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (gameArray[i][j] == 0) {
						System.out.print("| X |");
					} else if (gameArray[i][j] == 1) {
						System.out.print("| O |");
					} else {
						System.out.print("|   |");
					}
				}
				System.out.println();
				System.out.println("===============");
			}

		}
	   

		public static void computerTurn(int[][] gameArray) {

			Random random = new Random();
			int row = random.nextInt(3);
			int cols = random.nextInt(3);
			if (isValidTurn(gameArray, row, cols)) {
				gameArray[row][cols] = 1;
			} else {
				computerTurn(gameArray);
			}

	}
		
		public static void userTurn(int[][] gameArray) {
			System.out.println("Your Turn....");
			System.out.println("Enter key");
			//System.out.print("Row=");
			int [][] fill = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
			int key = Utility.getInt() ;
			int row=fill[key-1][0];
			int col=fill[key-1][1];
			if (isValidTurn(gameArray, row, col)) {
				gameArray[row][col] = 0;
			} else {
				userTurn(gameArray);
			}

	}
		
		public static  boolean checkWin(int[][] gameArray, int i) {
			for (int j = 0; j < 3; j++) {
				if (gameArray[j][0] == i && gameArray[j][1] == i  // ||
						&& gameArray[j][2] == i) {
					return true;
				}
				if (gameArray[0][j] == i && gameArray[1][j] == i // ----
						&& gameArray[2][j] == i) {
					return true;
				}
			}
			if (gameArray[0][0] == i && gameArray[1][1] == i // x
					&& gameArray[2][2] == i) {
				return true;
			}
			if (gameArray[0][2] == i && gameArray[1][1] == i //
					&& gameArray[2][0] == i) {
				return true;
			}
			return false;
	}
	
		
		
		public  static String ticTacToe() {
			boolean userTurn = false;
			int gameArray[][] = new int[3][3];
			

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					gameArray[i][j] = -1; //initially game array is null so print -1
				}
			}
			
			
			for (int k = 0; k < 9; k++) {

				if (userTurn) {
					userTurn(gameArray);
					userTurn = false;
					printGameArray(gameArray);
					if (checkWin(gameArray, 0)) {
						return "You Won";
					}

				} else {
					System.out.println("Computer's Turn");
					computerTurn(gameArray);
					userTurn = true;
					printGameArray(gameArray);
					if (checkWin(gameArray, 1)) {
						return "Computer Won";
					}

				}

				
			}

			return "Match Draw";
		}

		/*public static boolean isValidTurn(int[][] gameArray, int row, int cols) {
			if (gameArray[row][cols] == -1) {
				return true;
			}
			return false;*/
		public static boolean isValidTurn(int[][] gameArray, int row, int cols ) {
			if (gameArray[row][cols] == -1 ) {
				return true;
			}
			return false;
	}
		
		

		//***************** Method for to print frequecy count ********************//
		
		public static int frequecyCount(String str) {
			String s1[] = str.split(" ");
	         System.out.println(s1.length);
	         System.out.println("Entered String");
	         for(int i = 0; i< s1.length ; i++)
	         {
	         System.out.print(s1[i]);
	         System.out.print(" ");
	         }
	         for(int i = 0; i< s1.length ; i++)
	         {
	         	for(int j = i+1; j < s1.length; j++)
	         	{
	         	if(s1[i].compareTo(s1[j]) > 0)// compare charecters of string
	         	{
	         		String temp = s1[i];
	         		s1[i] = s1[j];
	         		s1[j] = temp;
	         	}
	         }
	         }
	         System.out.println();
	         System.out.println("Sorted String:");
	         for(int i = 0; i< s1.length ; i++)
	         {
	         System.out.print(s1[i]);
	         System.out.print(" ");
	         }
	         System.out.println();
	         int count = 1;
	         for(int i = 0; i< s1.length ; i++)
	         {
	         	for(int j = i+1; j < s1.length; j++)
	         	{
	         		if(s1[i].equals(s1[j]))// count repeated element in string
	         		{
	         			count ++;
	         			s1[j] = "0";// REPLACE ELEMENT TO ZERO IF MATCH
	         		}
	         }
	         	if(s1[i] != "0")
	         	{
	         		System.out.println("Frequency of "+s1[i]+"= "+count );
	         	}
	         count = 1;
	 }
			return count;

		}		
		
	//**************** Method for frequency count **************************************************//
		
		public static int numberChek(int n) {
			
		
		System.out.println("Imagine number between 0 to " +n);
    	int low=0;
    	int high=n;
    	int guess=(low+high)/2;
    	char input=' ';
    	int tries=1;
    	if(high>=low) 
    	{
    		while(input !='y') 
    		{
    			
    			System.out.println("Is your number"+guess+"?");
    			System.out.println("y/n");
    			input=scanner.next().charAt(0);
    			if(input == 'n')
    			{
	    			System.out.println("h.Is your number higher than "+ guess+"?");
	    			System.out.println("l.Is your number lower than "+ guess+"?");
	    			input=scanner.next().charAt(0);
	    			if(input=='h')
	        		{
	        		    low=guess;
	        		    guess=(high+low)/2;
	        		    tries++;
	        		}
	        		else if(input=='l')
	        		{
	        			high=guess;
	        			guess=(high+low)/2;
	        			tries++;
	            	}
    			}
    		}
    	}
		return guess;
    	
    }
		
	//************************ method for regex *******************************************************//
		
		
		public static String checkResult(String firstName, String lastName, String phoneNumber, String emailId, String userName, String passWord)
		{
			boolean validation= false;
			System.out.println("Enter first name of user:");
			 while(validation !=true) {
				  firstName = Utility.getString();
				 validation = Utility.stringValidation(firstName);
					if(validation == false)
					{
						System.out.println("Enter correct name");
					}
					return firstName;
				}
			 
			 validation = false;
				System.out.println("Enter last name");
				while(validation != true)
				{
				 lastName =Utility.getString();
					validation = Utility.stringValidation(lastName);
					if(validation == false)
					{
						System.out.println("please Enter correct Lastname");
					}
				}
		

	       validation = false;
		System.out.println("Enter user phone number");
		while(validation != true)
		{
			 phoneNumber = Utility.getString();
			validation = Utility.contactValidation(phoneNumber);
			if(validation == false)
			{
				System.out.println("please Enter correct phone number");
			}
		}
		return phoneNumber;
		}
		
		
		//********************** method for Replacement *********************************//
		   //match and and replace element by regex
		    public static String replacementregex(String s,String change,String req)
		    {
		    	Pattern p = Pattern.compile(change);
		    	Matcher m = p.matcher(s);
		    	return m.replaceAll(req);
		    }
		    
		//********************* method for to check string valiation*********************//
		    
		   // check my String contain character in string 
		    public static boolean stringValidation(String name)
		    {
		    	String regex ="[a-zA-z]+";
		    	if(name.matches(regex) == true)
		    	{
		    		return true;
		    	}
		    	return false;
		    }

		//*********************** method for email validation ***************************//
		    
		    public static boolean emailidValidation(String eid)
		    {
		    	String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";//String starts with word + indicate continuation
		    	//\\^ MAtch starts with
		    	//\\+ continue
		    	//\\w  MAtch wordcharacter
		    	//\\.  Match contain .
		    	if(eid.matches(regex) == true )
		    	{
		    		return true;
		    	}
		    	return false;
		    	
		    }
		//********************** method for contact validation **************************//
		    
	    public static boolean contactValidation(String phno)
		    {
		    	String regex ="[0-9]{10}$";
		    	if(phno.matches(regex) == true)
		    	{
		    		return true;
		    		
		    	}
		    	return false;
		    }
		//********************** method for user id validation *************************//
		    
	    public static boolean uIdValidation(String uname)
		    {
		    	String regex ="[0-9a-zA-Z]+";
		    	if(uname.matches(regex) == true)
		    	{
		    		return true;
		    	}
		    	return false;
		    }   
		//********************* method for password validation ************************//
	    
		public static boolean  passwordValidation(String password,String fn,String ln,String un)

		{
			String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
			         
			if(password.matches(regex) == true && (password != fn||password != ln||password != un))
			{
				return true;
			}
		return false;
		}
		
		//**********************************************************************************************************************
		     public static int reverseNum(int n)
	          	{
		     	 int rev = 0;
	         	 int num = 0;
	    	 
	    	        while(n !=0)
	    	         {
	    	         	num = n%10;                        //get last digit
	    	          	rev =rev*10+num;                   //multiply by 10 so we get reverse proper number  
	    		        n =n/10;                           //divide it by 10
	             	 }
	    	      return rev;
	        	}
	//*****************************************************************************************************************
		public static void printIntMatrix(int matrix[][],int row,int col)
		{
		for(int i  = 0; i < row;i++)
	     {
	  	   for(int j = 0;j < col;j++ )
	  	   {
	  		  System.out.print(matrix[i][j]+"\t");
	  	   }
	  	   System.out.println();
	     }
	}
	//**************************************************************************************************************************************************
		public static void printStrMatrix(String matrix[][],int row,int col)
		{
		for(int i  = 0; i < row;i++)
	     {
	  	   for(int j = 0;j < col;j++ )
	  	   {
	  		  System.out.print(matrix[i][j]+"\t");
	  	   }
	  	   System.out.println();
	     }
	}
	//************************************************************************************************************************************************************
		public static void inputOfIntMatrix(int matrix[][],int row,int col)
		{
			System.out.println("Enter elements in matrix");
			Scanner scan = new Scanner(System.in);
			for(int i =0; i < row;i++)
			{
				for(int j =0; j < col;j++ )
				{
					matrix[i][j] = scan.nextInt();
				}
			}
			
	}
		public static int isrepeatNumber(int[] array) {
			
			int count = 0;
			for(int i=0;i<array.length;i++) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i] == array[j]) {
						System.out.println("repeated number is this:"+array[i]);
						count++;
					}
					//System.out.println("the count of"+array[i]+"is"+count);
				}
			}
			return count;
		}

		public static int[][] trasposDemo(int row,int col){
			
		int [][]array = new int [row][col];
		  System.out.println("Enter element in matrix :");
		  
		  for(int i=0;i<row;i++) {
			  for(int j=0;j<col;j++) {
				   array[i][j] = Utility.getInt();
			  }
		  }
		  System.out.println();
		  
		  System.out.println("before matrix:");
		  for(int i=0;i<row;i++) {
			  for(int j=0;j<col;j++) {
				  System.out.print(array[i][j]+"\t");
			  }
			  System.out.println();
		  }
		
		  System.out.println("after matrix is below:");
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		

}
		return array ;
	
}

		
     //************************* Method for Unordered **********************************//

		
		public static void unorderedList(String searchElement, MyLinkedList<String> mll) {
			// TODO Auto-generated method stub
			
			if(!mll.search(searchElement))
			{		
					System.out.println("The enter element is not in the list then we add in the list");
					//Add a Element in a LinkedList
					mll.add(searchElement);
			}
			else
			{
				Integer deletedElement=mll.index(searchElement);
				//Remove a element in a LinkedList
				mll.pop(deletedElement);
			}
			System.out.println("List of elements are :");
			//Display the element in the LinkedList
			mll.display();
		}

	//****************** balanced Paratheses *******************************//	
		
		public static boolean checkForValidExpression(String expression) {
			
			MyStack<Character> mystack=new MyStack<Character>();
			char paranthes;
			for(int i=0;i<expression.length();i++)
			{
				paranthes=expression.charAt(i);
				if(paranthes=='(' || paranthes=='{' || paranthes=='[')
				{
					mystack.push(paranthes);
				}
				
					else
					{
						if(mystack.pop() != null) {
							return false;
						}
						switch (paranthes)
						{
						case ')':
							if(mystack.peek().equals('('))
							{
								mystack.pop();
							}
							else
							{
								return false;
							}
							break;
						case '}':
							if(mystack.peek().equals('{'))
							{
								mystack.pop();
							}
							else
							{
								return false;
							}
							break;
						case ']':
							if(mystack.peek().equals('['))
							{
								mystack.pop();
							}
							else
							{
								return false;
							}
							break;
						}
					}
				}
			return true;
		}

	//***************************  method for banking cash counter ***********************//
		
		
		public static void checkbankingcashCounter(Integer initialAmount, Integer numberofPerson )
		{
			MyQueue<Integer> myQueue = new MyQueue<Integer>();

			Integer depositamount;
			Integer withdrawAmount ;
			for(int i=0;i<numberofPerson;i++)
			{
				//Add the element in the Queue
				myQueue.enqueue(i);
			}
			while(myQueue.size()!= 0)
			{
				System.out.println("Choose one option");
				System.out.println("Enter 0 to deposit");
				System.out.println("Enter 1 to withdraw");
				int option=Utility.getInt();
				
				switch(option)
				{
				case 0:
					System.out.println("Enter how much amount you want to deposit");
					depositamount=Utility.getInt();
					initialAmount=initialAmount+depositamount;
					System.out.println("Update balance is "+initialAmount);
					//remove in the Queue
					myQueue.dequeue();
					myQueue.display();
					break;
				case 1:
					System.out.println("Enter how much money you want to withdraw");
					withdrawAmount=Utility.getInt();
					if(withdrawAmount>initialAmount)
					{
						System.out.println("Sorry insufficiet balance");
						System.out.println("If you want to withdraw money less than "+initialAmount);
						System.out.println("If yes then press 1 otherwise press 0");
						if(Utility.getInt()==1)
						{
							continue;
							
						}
						
						//remove in the queue
						myQueue.dequeue();
						myQueue.display();
					}
					else
					{
						initialAmount=initialAmount - withdrawAmount;
						System.out.println("The updated balance is:"+initialAmount);
						//remove in the queue
						myQueue.dequeue();
						myQueue.display();
					}
					break;
				default:
						System.out.println("Invaild option");

				}

			}
			

}
    //****************** method for Palindrome Checker *************************//
		
		public static  int palindromeCheker(String string) {
			
			DequeUtility<Character> dequeUtility=new DequeUtility<Character>();

			for(int i=0;i<string.length();i++)
			{
				char c =string.charAt(i);
				//adding each character to the rear of the deque
				dequeUtility.addRear(c);
				
			}
			int flag=0;

			while(dequeUtility.size()>1)//Check the size of the deque greater than 1
			{
				if(dequeUtility.removeFront()!=dequeUtility.removeRear())
				{
					flag=1;
					break;
				}
			}
			
			return flag;
			
		}

		
}
 
 

		
		
		
		


 	








		
	
		
		
	
	
		
	
	
	
	
	
	
	
	
		
		
	
	
	
	
				 
			
				
	
	
	
	
	
	
		
	
	
