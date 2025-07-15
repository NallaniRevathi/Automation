package week3Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stoped";  
	 	String text2 = "posted";
//to check anagram or not	 	
	 	if (text1.length()!=text2.length()) {
	 		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	 	}
	 	else {
	 		char[] charArray1 = text1.toCharArray();
	 		char[] charArray2 = text2.toCharArray();
//to sort array	 		
	 		Arrays.sort(charArray1);
	 		Arrays.sort(charArray2);
//checking for equal or not	 		
	 		if (Arrays.equals(charArray1, charArray2)) {
	 			System.out.println("The given strings are Anagram");
	 		}
	 		else {
	 			System.out.println("The given strings are not an Anagram");
	 		}
	 		
	 	}
	 	
	}

}
