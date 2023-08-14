package com.bilgeadam.week02.lecture003;

public class Question11 {

	/*
	 * 1 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene
	 * kadar çalışsın. en son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını
	 * yazdıralım.
	 * 
	 */

	public static void main(String[] args) {

		int toplam = 0;
		int i = 1;
		int sayac = 0;

//		while (toplam <= 50) {
//			toplam += i;
//			sayac = i;
//			i++;
//		}
//
//		System.out.println("Toplam =>> " + toplam + "  -Döngü =>> " + sayac);

		for (toplam = 0; toplam <= 50; i++) {
			toplam += i;
		}
		System.out.println("Toplam =>> " + toplam + "  -Döngü =>> " + (i - 1));

	}

}
