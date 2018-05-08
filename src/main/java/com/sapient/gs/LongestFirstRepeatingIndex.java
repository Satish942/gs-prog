package com.sapient.gs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestFirstRepeatingIndex {
	
	public void firstLongestRepeating(String str) {
		
		Map<Integer, Integer> indexAndCounts = new LinkedHashMap<Integer, Integer>();
		int i=0;
		for(char c :str.toCharArray()) {
			
			
		}
	}


	public static void main(String[] args) {

		String s="aaaabbbbbcccc";
	    char[] chars=s.toCharArray();
	    int startIndex=0,maxLength=0;
	    
	    for(int i=0;i<chars.length;) {
	      int len=0;
	      int index=i;
	      char c=chars[i];
	      while(i<chars.length && chars[i]==c) {              
	        i++;
	        len++;        
	      }
	      if(maxLength<len){
	        maxLength=len; 
	        startIndex=index;
	      }    
	    }
	    
	    System.out.println("Longest repeating string:"+ s.substring(startIndex ,startIndex+maxLength));
	}

}
