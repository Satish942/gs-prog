package com.sapient.gs;

public class MakePalindrum {

	public static void main(String[] args) {

		// System.out.println(largestPalindromeString("abccbakgadagxyzzyx"));

		System.out.println(largestPalindromeString("bcbas"));
		// System.out.println(largestPalindromeString("2212343214569"));
		// System.out.println(largestPalindromeString("hellow"));
		// System.out.println(largestPalindromeString("mmmm11111"));
	}

	private static String largestPalindromeString(String str) {
		int start = 0, start2 = 0, end = 0, end2 = 0;
		String largestPal = "";
		for (int i = 1; i < str.length(); i++) {
			start = i - 1;
			start2 = i - 1;
			end = i + 1;
			end2 = i + 1;

			// handle odd length palindrome
			while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
				String pal = str.substring(start, end + 1);
				start--;
				++end;

				start2 = start;
				end2 = end;

				largestPal = pal;
			}
			// handle even length palindrome
			start = i - 1;
			end = i;
			while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
				String pal = str.substring(start, end + 1);
				// largestPal = pal.length() > largestPal.length() ? pal : largestPal;
				start--;
				end++;
				start2 = start;
				end2 = end;
				largestPal = pal;
			}

			if (largestPal != str) {

				if (start2 < 0) {
					String atFront = null;
					while (end2 < str.length()) {
						largestPal = new Character(str.charAt(end2)).toString() + largestPal
								+ new Character(str.charAt(end2)).toString();
						end2++;
						atFront = atFront == null ? atFront = new Character(str.charAt(end2 - 1)).toString()
								: new Character(str.charAt(end2 - 1)).toString() + atFront;
					}
					System.out.println(atFront.length() + "char/chars atFront :" + atFront);
					break;
				} else if (end2 > str.length()-1) {
					String atEnd = null;
					while (start2 >= 0) {

						largestPal = new Character(str.charAt(start2)).toString() + largestPal
								+ new Character(str.charAt(start2)).toString();
						start2--;
						atEnd = atEnd == null ?  new Character(str.charAt(start2 + 1)).toString()
								: atEnd + new Character(str.charAt(start2 + 1)).toString();
					}
					System.out.println(atEnd.length() + "char/chars atEnd :" + atEnd);
					break;
				}
			}

		}
		System.out.println(largestPal);

		return str;
	}

}
