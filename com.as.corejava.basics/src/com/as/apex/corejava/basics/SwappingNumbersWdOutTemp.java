package com.as.apex.corejava.basics;

public class SwappingNumbersWdOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		System.out.println("before swapping a: "+a +"value of b is :"+b);
		
		a= a+b;//30
		b= a-b;//10
		a =a-b;//20
		
		System.out.println("After swapping a: "+a + "value of b is :"+b);
		
		
	}

}
