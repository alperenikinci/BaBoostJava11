package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {
	/*
	 * 
	 * Disaridan bir String deger alacagiz.
	 * 
	 * Bu String degerdeki her bir harfi kontrol edecegiz. Tekrar edenleri bir sete,
	 * tekrar etmeyenleri ise baska bir sete atacagiz.
	 * 
	 * Sonra bu iki seti de yazdiracagiz.
	 * 
	 * araba
	 * 
	 * tekrar edenler; a Tekrar etmeyenler; r b
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

//		if (domatesSay("cherry", 9)) {
//			System.out.println("if'in icerisine girebildik");
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir kelime giriniz : ");
		String kelime = scanner.nextLine();

		Set<Character> tekrarEdenler = new HashSet<>();
		Set<Character> tekrarEtmeyenler = new HashSet<>();

		// araba
		// a harfi alindi tekrarEtmeyenlere gitti.
		// raba
		// r harfi alindi tekrarEtmeyenlere gitti.
		// aba
		// a harfi tekrarEtmeyenlerden cikarildi, tekrarEdenlere eklendi.
		// ba
		// b harfi alindi tekrarEtmeyenlere gitti.
		// a

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);

			if (!tekrarEdenler.contains(c) && !tekrarEtmeyenler.add(c)) {
				tekrarEtmeyenler.remove(c);
				tekrarEdenler.add(c);
			}
		}

		System.out.println("Tekrar edenler");
		tekrarEdenler.forEach(System.out::println);

		System.out.println("Tekrar etmeyenler");
		tekrarEtmeyenler.forEach(System.out::println);
	}

	public static boolean domatesSay(String domates, int adet) {
		if (adet < 10) {
			System.out.println(adet + " adet " + domates + " vardir.");
			return true;
		} else {
			System.out.println(adet + " adet " + domates + " vardir.");
			return false;
		}
	}

}
