package com.sapient.gs;

public class StringPermutations {
	public static void main(String args[]) {
        permutation("abc");

}
	
	public static void permutation(String input){ 
		permutation("", input);
		}
	

private static void permutation(String perm, String word) {
	if (word.isEmpty()) {
		System.err.println(perm );
		} 
	else {
		for (int i = 0; i < word.length(); i++) {
			//System.out.println("i="+i+" word.length()::"+word.length()+" perm: "+perm +" word :"+ word);
			permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			} 
		}
	}
}



	
