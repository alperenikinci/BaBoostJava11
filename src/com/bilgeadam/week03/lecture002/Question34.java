package com.bilgeadam.week03.lecture002;

public class Question34 {

	// dizide en büyük 2.sayıyı bulalım.

	public static void main(String[] args) {
		int[] sayilar = { 120, 130, 125, -256, 16, 1300, 1258, 81, 14 };

		int enBuyuk = sayilar[0];
		int ikinci = Integer.MIN_VALUE;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] > enBuyuk) {

				enBuyuk = sayilar[i];

			}
		}

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < enBuyuk && sayilar[i] > ikinci) {
				ikinci = sayilar[i];

			}

		}

		System.out.println("ikinci en buyuk sayi " + ikinci);
		System.out.println("En buyuk sayi " + enBuyuk);
	}

}
