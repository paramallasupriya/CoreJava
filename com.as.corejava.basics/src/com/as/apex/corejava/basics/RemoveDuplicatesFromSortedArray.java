package com.as.apex.corejava.basics;

public class RemoveDuplicatesFromSortedArray {
	
	 public static void main (String[] args)
	    {
	        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        int n = arr.length;
	         
	        n = removeDuplicates(arr, n);
	  
	        // Print updated array
	        for (int i=0; i<n; i++)
	           System.out.print(arr[i]+" ");
	    }

	 // Function to remove duplicate elements.This function returns new size of modified array.
    static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1)
            return n;
      
     // To store index of next unique element
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
       // Store the last element as whether it is unique or repeated, it hasn't stored previously
        arr[j++] = arr[n-1];
      
        return j;
    }
   }
