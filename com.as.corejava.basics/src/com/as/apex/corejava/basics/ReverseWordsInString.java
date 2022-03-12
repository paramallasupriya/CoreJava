package com.as.apex.corejava.basics;

public class ReverseWordsInString 

{  
public static String reverseWord(String str)
{  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words)
    {  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  

public static void main(String[] args) {  
    System.out.println(ReverseWordsInString.reverseWord("Live life to the fullest"));  
    System.out.println(ReverseWordsInString.reverseWord("I am Supriya Paramalla"));    
    }  

} 