package com.as.apex.corejava.basics;


public class MultiplesOf5Till1000 {
	
	public static void main(String[] args){

	  int i = 5;// Multiples of 5
	  int n= 1000;// We need 5 multiples till 1000
      int Total = 5;

	  System.out.print(" Multiples of " + i + " till " + n + " are: " + Total + " ");

	  for (int counter = 0 ; Total < n ; counter++) 
	  {
		  Total = i*(2 + counter);
		  System.out.print(Total + " ");
		
	  }

	}

}
//