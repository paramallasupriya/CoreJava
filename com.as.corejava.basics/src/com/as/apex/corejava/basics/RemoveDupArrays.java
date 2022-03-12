package com.as.apex.corejava.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RemoveDupArrays {
	public static void main(String[] args) {

			List<String> listObject = new ArrayList<>();
			listObject.add("ram");
			listObject.add("mohan");
			listObject.add("shyam");
			listObject.add("mohan");
			listObject.add("ram");
			Iterator<String> itObjectForList = listObject.iterator();
			while (itObjectForList.hasNext()) {
				System.out.println(itObjectForList.next());
			}
			System.out.println("After removing duplicates ----");
			for (int i = 0; i < listObject.size(); i++) {
				for (int j = i + 1; j < listObject.size(); j++) 
				{
					if (listObject.get(i) == (listObject.get(j))) 
					{
						listObject.remove(j);
					}	
				}
			}
			System.out.println(listObject);
		}
	}