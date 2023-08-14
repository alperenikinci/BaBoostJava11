package com.bilgeadam.week03.lecture003;

public class Question36 {

	// dizideki bütün sayıların toplamını yazdıralım.
	// dizinin her bir elemanı için;
	// çift ise çifttir, tek ise tektir yazdıralım.

	public static void main(String[] args) {

		int sayilar[] = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {

			toplam += sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + "\t\t\t\tçift bir sayıdır.");
			} else {
				System.out.println(sayilar[i] + "\t\t\t\ttek bir sayıdır.");

			}
		}
		System.out.println("Sayıların toplamı :\t\t" + toplam);

	}

}
