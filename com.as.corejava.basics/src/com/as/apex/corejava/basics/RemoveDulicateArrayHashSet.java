package com.as.apex.corejava.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDulicateArrayHashSet {

	public static void main(String[] args) {

		List<String> listObject = new ArrayList<>();
		listObject.add("ram");
		listObject.add("mohan");
		listObject.add("shyam");
		listObject.add("mohan");
		listObject.add("ram");
		System.out.println("Elements from the Array List are : ----");
		Iterator<String> itObjectForList = listObject.iterator();
		while (itObjectForList.hasNext()) {
			System.out.println(itObjectForList.next());
		}
		System.out.println("After converting into set ----");
		Set<String> set = new HashSet<String>(listObject);
		Iterator<String> itObjectForSet = set.iterator();
		while (itObjectForSet.hasNext()) {
			System.out.println(itObjectForSet.next());
		}
	}
}
