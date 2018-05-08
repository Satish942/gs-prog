package com.sapient.gs;

public class PowerOfTen {

	public PowerOfTen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		double n = -0.0100;
		boolean negative = false;
		n = Math.abs(n);
		System.out.println(n);
		System.out.println(isPowerOfTen(n));
	}

	private static boolean isPowerOfTen(double n) {
		if(n==0) return true;
		if (n < 1) {
			while (n < 1) {   //value in between 0 and 1
				System.out.println(n+" >>");
				n = n * 10;
			}
			System.out.println(n+" >>");
		}
		// n=1
		int pow = 1;
		while (pow < n) {
			pow *= 10;
		}
		return pow == n;
	}
}
