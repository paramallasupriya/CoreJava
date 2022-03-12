package com.as.apex.corejava.basics;

import java.util.Scanner;

public class FibonnaciScanner 

{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of terms");
	int n=sc.nextInt();
	int first=0,second=1,next;
	System.out.println("Fibonacci series is ");
	int i=0;
	while(i<n)
	{
	if(i<=1)
	    next=i;
	else
	{
	   next=first+second;
	   first=second;
	   second=next;
	}
	System.out.print(next + "");
	i++;
	sc.close();
	}
	}
}