package com.sapient.gs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LargestNonRepeatingString2 {

	public static  String largestStringwithUniquechar(String str) {
		
		Map<String,Integer> stringAndCount = new LinkedHashMap<String, Integer>();
		
		List<Character> charList = new ArrayList<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		int i=0;
		for(char c:str.toCharArray()) {
			++i;
			if(charList.contains(c))	{
				if(c == charList.get(0)) {//abca but abcad  removing first position
					charList.remove(0);
					charList.add(c);
					continue;
				}
				
				for(char c2:charList) {
					sb.append(c2);
				}
				
				stringAndCount.put(sb.toString(), sb.length());
									
				sb = new StringBuffer();
				charList = new ArrayList<Character>();
				charList.add(c);
				
			}else {
				if(i == str.toCharArray().length) {
					stringAndCount.put(new Character(c).toString(), 1);
				}
				charList.add(c);
			}
		}
		
		System.out.println("stringAndCount :"+stringAndCount);
		
		int max=0;
		String key = null;
		for(Map.Entry<String,Integer> entry:stringAndCount.entrySet() ) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				key = entry.getKey();
			}
			
		}
		
		return key;
		
	}

	public static void main(String[] args) {
		String str = "af";//aaabcaabbddeaff  -> ans deaf
		System.out.println(largestStringwithUniquechar(str));
	}

}
