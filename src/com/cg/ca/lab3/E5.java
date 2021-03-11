package com.cg.ca.lab3;

public class E5 {
 
	      static int wordcount(String string)  
	        {  
	          int countVariable=0;  
	      
	            char charInput[]= new char[string.length()];     
	            for(int i=0;i<string.length();i++)  
	            {  
	                charInput[i]= string.charAt(i);  
	                if( ((i>0)&&(charInput[i]!=' ')&&(charInput[i-1]==' ')) || ((charInput[0]!=' ')&&(i==0)) )  
	                    countVariable++;  
	            }  
	            return countVariable;  
	        }  
	      
	      public static void main(String[] args) { 
	    	  int countVariable=0;
	          String string ="    Thejesh has a cat";  
	         System.out.println(wordcount(string) + " words.");  

	    	  for(int i = 0; i < string.length(); i++) {    
	              if(string.charAt(i) != ' ')    
	                  countVariable++;    
	          }    
	    	  System.out.println("Total number of characters in a string: " + countVariable);
	    }  

	}
