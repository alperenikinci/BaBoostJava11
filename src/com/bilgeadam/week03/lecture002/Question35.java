package com.bilgeadam.week03.lecture002;

public class Question35 {

	// bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngü
	// sonlansın yoksa false yazdıralım

	public static void main(String[] args) {
		int[] sayilar = { 2, -256, 2, 1258, 2, 2 };
		boolean kontrol = false;
		for (int i = 0; i < sayilar.length - 1; i++) {

			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {

				kontrol = true;
				break;
			}
		}
		System.out.println(kontrol);
		kontrol = false;
		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] == 2 && sayilar[i - 1] == 2) {

				kontrol = true;
				break;
			}
		}
		System.out.println(kontrol);
	}
}
