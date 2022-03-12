package com.as.apex.corejava.basics;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MostRepeatedChars_sorted {
	public static void main(String[] args) 
	{
		String str="aaabbbbccccddddddeeeee";
		Map<Character,Integer> hashMap = new HashMap<>();
		
		for(int i=0; i<=str.length()-1; i++)
			if(hashMap.containsKey(str.charAt(i)))
			{
				int count = hashMap.get(str.charAt(i));
				hashMap.put(str.charAt(i), ++count);
			}	
			else
			{	
			hashMap.put(str.charAt(i), 1);	
			}
		int maxCharacterCount = Collections.max(hashMap.values());
		char maxCharacter= 'a';
		for (Entry<Character,Integer> entry : hashMap.entrySet())
		{
			if(entry.getValue() == maxCharacterCount) {
				maxCharacter = entry.getKey();
				System.out.println("counting occurance of each character before sorting: " +hashMap);
				System.out.println("Most Repeated Character : " +maxCharacter );
				System.out.println("Maximum character count : "+ maxCharacterCount);
			}
		}
		// TreeMap to store values of HashMap
        TreeMap<Character, Integer> sorted = new TreeMap<>();
 
        // Copy all data from hashMap into TreeMap
        sorted.putAll(hashMap);
 
        // Display the TreeMap which is naturally sorted
        System.out.println("counting occurance of each character after sorting: ");
		
        for (Entry<Character, Integer> entry1 : sorted.entrySet())
            System.out.println("Key = " + entry1.getKey() +
                         ", Value = " + entry1.getValue());     
	}
	
}