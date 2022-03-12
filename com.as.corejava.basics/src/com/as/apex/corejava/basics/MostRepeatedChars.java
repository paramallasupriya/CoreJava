package com.as.apex.corejava.basics;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedChars {
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
		Map<Character, Integer> hm1 = sortByValue(hashMap);
		System.out.println("counting occurance of each character after sorting as per the repeat ions : ");
		 // print the sorted hashmap
        for (Map.Entry<Character, Integer> en : hm1.entrySet()) 
        {
        	 System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }
	}
	 // function to sort hashmap by values
    public static HashMap<Character, Integer> sortByValue(Map<Character, Integer> hashMap)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hashMap.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}