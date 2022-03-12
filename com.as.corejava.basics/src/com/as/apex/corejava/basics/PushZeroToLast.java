package com.as.apex.corejava.basics;

public class PushZeroToLast {
	
	
	public static void pushZerosToEnd(int arr[],int n)
	{
	int count=0; //count of the non zero elements	
	
	for (int i = 0; i<n;i++)
	
		if (arr[i] != 0)
			arr[count++]=arr[i];
			
		while(count< n)
			arr[count++]=0;
	}
	

	public static void main(String Args[]) 
	{
		int arr[] = {0,1,0,2,0,3,0,4,0,5,60,0,0};
		int n =arr.length;
		pushZerosToEnd(arr,n);
		System.out.println("array after the zeros are pushed to end: ");
		for(int i=0; i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
