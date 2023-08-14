package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question27 {

	/*
	 * 
	 * Dışarıdan bir değer alacağız, içerisinde kaç tane a var bize değerini dönsün.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir kelime giriniz : ");
		String kelime = scanner.nextLine();
		int sayac = 0;

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'a') {
				sayac++;
			}
		}

		System.out.println("Kelimenin içinde : " + sayac + " adet a harfi bulunmaktadır.");
		scanner.close();
	}

}
