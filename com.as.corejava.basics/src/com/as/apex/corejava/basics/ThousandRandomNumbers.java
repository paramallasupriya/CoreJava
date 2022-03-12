package com.as.apex.corejava.basics;

import java.util.Random;

public class ThousandRandomNumbers 
{
	        public static void main(String[] args) 
	        {
	        	Random objGenerator = new Random();
	            for (int iCount = 0; iCount< 1000; iCount++)//This would print 1000 Numbers from the range till number 1000
	            {
	              int randomNumber = objGenerator.nextInt(1000);
	              System.out.println("Random No : " + randomNumber); 
	             }
	     }
	}