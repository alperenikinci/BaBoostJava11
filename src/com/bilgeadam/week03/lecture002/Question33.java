package com.bilgeadam.week03.lecture002;

public class Question33 {

	// dizide en büyük ve en küçük öğeyi bulma

	public static void main(String[] args) {

		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };

		int min = sayilar[0];
		int max = sayilar[0];

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < min) {
				min = sayilar[i];
			}
			if (sayilar[i] > max) {
				max = sayilar[i];
			}
		}

		System.out.println("max= " + max + "  " + "min= " + min);

	}
}