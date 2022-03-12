package com.as.apex.corejava.basics;

public class PrintArray {

	public static void main(String[] args) {  
	        //Initialize array  
	        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
	        System.out.println("Elements of given array: ");  
	        //Loop through the array by incrementing value of i  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.println(" Element Number : " + (i+1) + " is "+ arr[i] + " ");  
	        }  
	    }  
	}  

