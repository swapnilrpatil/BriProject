package com.bridgelab.library;

import java.util.Scanner;

public class CountStopWatch {

	public long startTime = 0;
	public long stopTime = 0;
	public static  long elapsedTime ;
	
	
	public void start() {
		startTime = System.currentTimeMillis();
		System.out.println("Start time is:"+startTime);
   	}
	
	public void stop() {
		stopTime = System.currentTimeMillis();
		System.out.println("Stop time is:"+stopTime);
   	}
	
	public void getelapsedTime() {
		
		elapsedTime = stopTime - startTime;
		System.out.println("Total time elapsed (in millisec) is:"+elapsedTime);
		 
		System.out.println("Total time elapsed (in sec) is:"+(elapsedTime/1000)+"sec\n");
		
	}
	
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			CountStopWatch sw = new CountStopWatch();
			
			//int startTime;
		//	int stopTime;
			
			
			do {
				System.out.println("press 1 to start a timer:");
				int startTime = sc.nextInt();
				
				if(startTime == 1) 
					sw.start();
				
					else 
						 return;
				
				System.out.println("press 0 to stop a stopwatch:");
				int stopTime = sc.nextInt();
				
				if(startTime == 0) {
					sw.stop();
				}
				else 
				    // return;
				
			//	System.out.println("print the Elapsed time is :"+elapsedTime);
	                    sw.getelapsedTime();
				
				}while(true);
			
			}

		}
	
	
	
	

	}
	
	

