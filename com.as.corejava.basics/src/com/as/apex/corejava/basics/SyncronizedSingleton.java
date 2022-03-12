package com.as.apex.corejava.basics;

public class SyncronizedSingleton {

		private String data=  "Hello...";
		
		// 1st Step
		private static SyncronizedSingleton sObj;
		
		//2nd Step
		
		private SyncronizedSingleton()
		{
		
		}
		
		//3rd step
		public static SyncronizedSingleton getObject() 
		{
			if(null == sObj) 
			{
				synchronized(SyncronizedSingleton.class)//Double checked locking
				{
					if(null == sObj) {
					sObj= new SyncronizedSingleton();
					}
				}
			}
			return sObj;
		}
		
		
		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
		
		public static void main(String[] args) {
			
			SyncronizedSingleton obj1 = SyncronizedSingleton.getObject();
			SyncronizedSingleton obj2 = SyncronizedSingleton.getObject();
			
			System.out.println("obj1 Data ::" +obj1.getData());
			System.out.println("obj2 Data ::" +obj2.getData());
			
			obj1.setData("How are you doing ??");
			
			System.out.println("obj1 Data ::" +obj1.getData());
			System.out.println("obj2 Data ::" +obj2.getData());
		}

	}
		
