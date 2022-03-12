package com.as.apex.corejava.basics;
	import java.util.*;  
	public class MergeArrayList  
	{  
	public static void main(String args[])   
	{  
	Integer[] firstArray = new Integer[] { 13, 12, 11, 6, 9, 3 }; // first array
	Integer[] secondArray = new Integer[] { 78, 34, 56, 67, 2, 11, 7 }; // second array
	List<Integer> list = new ArrayList<Integer>(Arrays.asList(firstArray)); //returns a list view of an array  
	//returns a list view of str2 and adds all elements of str2 into list  
	list.addAll(Arrays.asList(secondArray));     
	Object[] mergedArray = list.toArray();         //converting list to array  
	System.out.println(Arrays.toString(mergedArray));  //prints the resultant array  
	}  
	}