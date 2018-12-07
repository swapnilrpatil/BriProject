package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class MathFuction1 {

//****************Future value******************************//
	
	public static double futureValue1(double value, double rate, double time) {
		
		//	double p=compound;
			//double q=rate;
		//	double r=time;
		double futureValue = value*(Math.pow(1+rate, time));
		return futureValue;
		}

 //******************* Present Value ***********************//
	
	public static double presentValue(double value, double rate, double time) {
		
		double presentValue = value / (Math.pow(1+rate, time));
		return presentValue;
		
	}
	
  //****************** Square root value ****************//
	
	public static double findSquare(double c) {
		
		 double  epsilon = 1e-15;
    	 double t = c;

    	 while(Math.abs(t-c/t)>epsilon*t) {
	    	t=(c/t+t)/2.0;
	    	
	        }
			return t;
	}
	
  //**************** check Collinear slope *************//
	
	
	public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
		
	    int a =	(y2-y1)/(x2-x1);
		int b = (y3-y2)/(x3-x2);
		int c = (y1-y3)/(x1-x3);
		
		if( a == b && b== c) {
			return true;
		}
		return false;
	}
	
   //*************** Fuction to get Max value *********************//
	
	  public static  int  max(int [] array){
		  
		  int max = array[0];
		  for(int i=0;i<array.length;i++) {
			  
			  if(array[i]>max) {
				  max = array[i];
				  
			  }
		  }
		   return max;
	  }
		  
	   //*************** Fuction to get Min value *********************//

	  public static int min(int [] array) {
		  
		  int min = array[0];
		  for(int i= 0;i<array.length;i++) {
			  if(array[i]<min) {
				  
				  min = array [i];
				  
			  }
		  }
		   return min;
	  }
	  
	  
	
}