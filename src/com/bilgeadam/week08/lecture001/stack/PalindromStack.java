package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

import com.bilgeadam.week08.lecture001.Utility;

public class PalindromStack {

	/*
	 * 
	 * Disaridan bir metin girecegiz. Sonra bu metni bir stack'e atayacagiz.
	 * 
	 * daha sonra bu kelimenin palindrom olup olmadigini kontrol eden bir metot
	 * yazalim.
	 * 
	 */

	Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
		PalindromStack palindromStack = new PalindromStack();

		String kelime = Utility.stringDegerAlma("Lutfen bir kelime giriniz : ");

		if (palindromStack.isPalindrome(kelime)) {
			System.out.println(kelime + " bir palindromdur...");
		} else {
			System.out.println(kelime + " palindrom degildir...");
		}
	}

	public void stackOlusturma(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
	}

	public boolean isPalindrome(String kelime) {
		stackOlusturma(kelime);

		for (int i = 0; i < kelime.length() / 2; i++) {
			if (stack.pop() != kelime.charAt(i)) {
				return false;
			}
		}
		return true;

	}

}
