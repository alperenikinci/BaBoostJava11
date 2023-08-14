package com.bilgeadam.week04.lecture003;

public class Question50 {

	/*
	 * 
	 * int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
	 * 
	 * Yukarıdaki dizide tekrar eden sayıları ve kaç kere tekrar ettiklerini
	 * yazdıralım.
	 */

	public static void main(String[] args) {
		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		tekrarEdenSay(dizi);

		// false,true,true,true,true,true,true,true,true,true
		// 1 sayısından 3 tane vardır.
		// 5 sayısından 2 tane vardır.
		// 9 sayısından 2 tane vardır.
		// 8 sayısından 1 tane vardır.
		// 0 sayısından 2 tane vardır.
	}

	public static void tekrarEdenSay(int[] array) {
		boolean[] kontrol = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {

			if (kontrol[i] == true) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					kontrol[j] = true;
				}
			}
			System.out.println(array[i] + " sayısı, " + count + " adet bulunmaktadır.");
		}

	}

}
