package com.as.apex.corejava.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrayElementsToTargetSum {
   public static void main(String args[]){
      //Reading the array from the user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created: ");
      int size = sc.nextInt();
      int[] myArray = new int[size];     
      System.out.println("Enter the elements of the array: ");
      for(int i=0; i<size; i++){
         myArray[i] = sc.nextInt();
      }
      //Reading the Sum of the numbers to be
      System.out.println("Enter the Sum of the numbers to be: ");
      int num = sc.nextInt();
      System.out.println("The array created is: "+Arrays.toString(myArray));
      for(int i=0; i<myArray.length; i++){
         for (int j=i; j<myArray.length; j++){
            if((myArray[i]+myArray[j])== num && i!=j){
                System.out.println("Numbers whose sum is: "+num);
            	System.out.println(myArray[i]+", "+myArray[j]);
            	System.out.println("Indexes of the numbers whose sum is: "+num);
            	System.out.println(i+", "+j);
               sc.close();
            }
         }
      }
   }
} 