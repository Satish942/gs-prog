package com.sapient.gs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BiggestNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 34, 3, 98, 9, 76, 45, 4,8 };
		
		
		//998764543431
		String largestNum = largestNumber(arr);
		System.out.println(largestNum);
		
		
Set<String> set = new TreeSet<String>( Collections.reverseOrder());
		
		
		set.add("1");
		set.add("34");
		set.add("3");
		set.add("98");
		set.add("9");
		set.add("76");
		set.add("45");
		set.add("4");
		set.add("8");
		
		System.out.println(set);

	}

	public static String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = String.valueOf(nums[i]);
			System.out.println(arr[i]+ " ");
		}		
				
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);	
			}
		});

		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}

		return sb.toString();
	}
}
