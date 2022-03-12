package com.as.apex.corejava.basics;

public class SingletonClass {
	
	private String data=  "Hello...";
	
	// 1st Step
	private static SingletonClass sObj = new SingletonClass();
	
	//2nd Step
	
	private SingletonClass()
	{
	
	}
	
	//3rd step
	public static SingletonClass getObject()
			{
			return sObj;
			}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		SingletonClass obj1 = SingletonClass.getObject();
		SingletonClass obj2 = SingletonClass.getObject();
		
		System.out.println("obj1 Data ::" +obj1.getData());
		System.out.println("obj2 Data ::" +obj2.getData());
		
		obj1.setData("How are you doing ??");
		
		System.out.println("obj1 Data ::" +obj1.getData());
		System.out.println("obj2 Data ::" +obj2.getData());
	}

}
	
	
