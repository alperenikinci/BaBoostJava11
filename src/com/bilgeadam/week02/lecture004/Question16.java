package com.bilgeadam.week02.lecture004;

public class Question16 {

	/*
	 * 
	 * 1'den 100'e kadar olan çift sayıların toplamının tek sayıların toplamına olan
	 * oranını bulalım.
	 * 
	 */

	public static void main(String[] args) {

		double tekToplam = 0, ciftToplam = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				ciftToplam += i;
			} else {
				tekToplam += i;
			}
		}

//		for (double i = 1; i <= 100; i += 2) {
//			tekToplam += i;
//			ciftToplam += i + 1;
//		}

		double oran = ciftToplam / tekToplam;

		System.out.println("Cift sayı toplamının, tek sayı toplamına oranı : " + oran);

	}

}
