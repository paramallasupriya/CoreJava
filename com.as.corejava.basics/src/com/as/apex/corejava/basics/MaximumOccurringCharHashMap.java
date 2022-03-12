package com.as.apex.corejava.basics;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class MaximumOccurringCharHashMap 
{
    private static void printMaxOccurringChar(String inputString)
    {   
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();
       for (char c : charArray) 
        {
            if (charCountMap.containsKey(c))
                     charCountMap.put(c, charCountMap.get(c)+1);
           else
                 charCountMap.put(c, 1);
        }
       Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
       //Code to print all the characters with their corresponding occurance
       int mapCount = 0;
       char mapChar = 0;
       System.out.println("Input String : "+inputString);
       for (Entry<Character, Integer> entry : entrySet) 
        {
                  mapChar = entry.getKey();
                  mapCount = entry.getValue();
                  System.out.println("Character Occurrence and its count :");
                  System.out.println(mapChar+" : "+mapCount);                  
        }
       //Code for Maximum occurance of Character
        int maxCount = 0;
        char maxChar = 0;
       // LinkedHashMap<Character,Integer> sortedOutputMap=new LinkedHashMap<Character,Integer>();
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();                 
                maxChar = entry.getKey();
            }            
            System.out.println("Input String : "+inputString);            
            System.out.println("Maximum Occurring char and its count :");             
            System.out.println(maxChar+" : "+maxCount);            
         }        
    }     
    public static void main(String[] args) 
    {
        printMaxOccurringChar("Java Concept Of The Day");
         
        System.out.println("========================");
         
        printMaxOccurringChar("Java J2ee Android Hibernate JSP");
         
        System.out.println("========================");
         
        printMaxOccurringChar("abbcccddddeeeeeffffff");
         
        System.out.println("=========================");
         
        printMaxOccurringChar("122333444455555666666");
    }
}