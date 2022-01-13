package com.challenge;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println(checkForPalindrome("abccba"));
		System.out.println(checkForPalindrome("Was it a car or a cat I saw"));
		System.out.println(checkForPalindrome("I did, did I?"));
		System.out.println(checkForPalindrome("hello"));
		System.out.println(checkForPalindrome("Don't nod"));
		System.out.println(checkForPalindrome("ewe"));
	}

	private static boolean checkForPalindrome(String string) {
		
		LinkedList<Character> stack = new LinkedList<Character>();
		LinkedList<Character> queue = new LinkedList<Character>();
		String lowerCase = string.toLowerCase();
		
		for(int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				stack.push(c);
				queue.add(c);
			}
		}
		


		return stack.pop().equals(queue.remove());
	}
	
}
