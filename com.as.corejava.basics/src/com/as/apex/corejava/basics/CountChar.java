package com.as.apex.corejava.basics;
//import java.util.*;
//Count of occurrence of the character in the given string
import java.io.*;
public class CountChar 
{

    public static void main(String[] args) throws IOException
    {
      String ch;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Statement:");
      ch=br.readLine();
      int count=0,len=0, maxCount=0;
      
        do
        {  
          try
          {
          char name[]=ch.toCharArray();
              len=name.length;
              count=0;
              for(int j=0;j<len;j++)
               {
                  if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
                      count++;
               }
              if(count!=0)
                System.out.println(name[0]+" "+count+" Times");
              ch=ch.replace(""+name[0],""); 
              //Suppi test code
              maxCount = count;
              System.out.println("maxcount is" + maxCount+" Times");
              char letter = name[0];
              System.out.println("Char is "+letter);
          }
          catch(Exception ex){}
        }
        while(len!=1);
   }

}