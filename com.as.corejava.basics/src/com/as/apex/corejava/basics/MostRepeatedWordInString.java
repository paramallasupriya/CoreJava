package com.as.apex.corejava.basics;
//Program to find the Most repeated word from the SEntence
import java.util.ArrayList;
import java.util.Scanner;

public class MostRepeatedWordInString{	
	public static void main(String[] args) throws Exception {
		String word = "";
		int count = 0, maxCount = 0;
		ArrayList<String> words = new ArrayList<String>();
		System.out.print("Enter string to analyse:");
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();        
			String[] string = input.toLowerCase().split("\\s"); 
			// Adding all words generated in previous step into words
			for (String s : string) 
			{
				words.add(s);
		    }	
		// Determine the most repeated word in the Sentence
		for (int i = 0; i < words.size(); i++) 
		{
			count = 1;
			// Count each word in the file and store it in variable count
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).equals(words.get(j))) {
					count++;
				}
			}
			// If maxCount is less than count then store value of count in maxCount
			// and corresponding word to variable word
			if (count > maxCount) {
				maxCount = count;
				word = words.get(i);
			}
		}
		System.out.println("The sentence entered by the User is: " + input);		
		System.out.println("Most repeated word in the sentence is : " + word);
		System.out.println("The number of times the most repeated word " + word +" occured in the sentence is " +maxCount);
		sn.close();
	}
}