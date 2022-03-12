package com.as.apex.corejava.basics;

public class SingletonEnum {

		
	public static void main(String[] args) {
		Abc obj1=Abc.INSTANCE;
		obj1.i=5;
		obj1.show();
		
		Abc obj2=Abc.INSTANCE;
		obj2.i = 6;
		
		obj1.show();
		obj2.show();
		
		Abc obj3=Abc.INSTANCE;
		obj3.i = 7;
		
		obj1.show();
		obj2.show();
		obj3.show();
		
	}
	
	enum Abc//;Special class //Support Java 1.5 and above versions
	{
		INSTANCE;
		int i;
		public void show()
		{
			System.out.println(i);
		}
	}
}
