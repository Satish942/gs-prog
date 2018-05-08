package com.sapient.gs;

public class PowerOfAnother {

	public static void main(String[] args) {		
		System.out.println(isPowerOf(5,125));		//(2,8)is 2 power of 8		
	}

	private static boolean isPowerOf(int x, int y) {		
		if(x==1) return y==1;		
		int pow=1;		
		while(pow<y) {
			pow= Math.abs(pow*x); //pow*x;
			System.out.println(pow);
		}
		return pow==y;
	}

}
