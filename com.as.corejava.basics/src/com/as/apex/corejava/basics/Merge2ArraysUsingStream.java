package com.as.apex.corejava.basics;

import java.util.stream.Stream;
import java.util.Arrays;

//import java.io.*;   
public class Merge2ArraysUsingStream {
// function to merge two arrays  
	public static <T> Object[] mergeArray(T[] arr1, T[] arr2) {
		return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
	}
	public static void main(String[] args) {
		Integer[] firstArray = new Integer[] { 13, 12, 11, 6, 9, 3 }; // first array
		Integer[] secondArray = new Integer[] { 78, 34, 56, 67, 2, 11, 7 }; // second array
		Object[] mergedArray = mergeArray(firstArray, secondArray); // merged array
		System.out.println("Merged array: " + Arrays.toString(mergedArray));
	}
}